package pl.infoshare.jpa.movies;

import org.springframework.data.jpa.domain.Specification;
import pl.infoshare.jpa.movies.model.Movie;
import pl.infoshare.jpa.movies.model.Genre;
import pl.infoshare.jpa.movies.model.Movie_;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class MovieFilters {

    public static Specification<Movie> byTitle(String title) {
        if (Objects.isNull(title)) {
            return ignore();
        }

        return (root, query, cb) -> cb.like(cb.upper(root.get(Movie_.title)), "%" + title.toUpperCase() + "%");
    }

    public static Specification<Movie> byGenre(Genre genre) {
        if (Objects.isNull(genre)) {
            return ignore();
        }

        return (root, query, cb) -> cb.equal(root.get(Movie_.genre), genre);
    }

    public static Specification<Movie> byScore(BigDecimal minScore, BigDecimal maxScore) {
        if (Objects.isNull(minScore) && Objects.isNull(maxScore)) {
            return ignore();
        }
        if (Objects.isNull(minScore)) {
            return byMaxScore(maxScore);
        }
        if (Objects.isNull(maxScore)) {
            return byMinScore(minScore);
        }

        return byMinScore(minScore).and(byMaxScore(maxScore));
    }

    public static Specification<Movie> byDate(LocalDate minDate, LocalDate maxDate) {
        if (Objects.isNull(minDate) && Objects.isNull(maxDate)) {
            return ignore();
        }
        if (Objects.isNull(minDate)) {
            return byMaxDate(maxDate);
        }
        if (Objects.isNull(maxDate)) {
            return byMinDate(minDate);
        }

        return byMinDate(minDate).and(byMaxDate(maxDate));
    }

    private static Specification<Movie> byMinDate(LocalDate minDate) {
        return (root, query, cb) -> cb.greaterThanOrEqualTo(root.get(Movie_.releaseDate), minDate);
    }

    private static Specification<Movie> byMaxDate(LocalDate maxDate) {
        return (root, query, cb) -> cb.lessThanOrEqualTo(root.get(Movie_.releaseDate), maxDate);
    }

    private static Specification<Movie> byMinScore(BigDecimal minScore) {
        return (root, query, cb) -> cb.greaterThanOrEqualTo(root.get(Movie_.score), minScore);
    }

    private static Specification<Movie> byMaxScore(BigDecimal maxScore) {
        return (root, query, cb) -> cb.lessThanOrEqualTo(root.get(Movie_.score), maxScore);
    }

    private static Specification<Movie> ignore() {
        return (root, query, cb) -> cb.and();
    }
}
