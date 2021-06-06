package pl.infoshare.jpa.movies;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.annotation.DateTimeFormat;
import pl.infoshare.jpa.movies.model.Genre;
import pl.infoshare.jpa.movies.model.Movie;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MovieSearch {

    private final String title;
    private final Genre genre;
    private final BigDecimal minScore;
    private final BigDecimal maxScore;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private final LocalDate minDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private final LocalDate maxDate;

    public MovieSearch(String title, Genre genre, BigDecimal minScore, BigDecimal maxScore, LocalDate minDate, LocalDate maxDate) {
        this.title = title;
        this.genre = genre;
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.minDate = minDate;
        this.maxDate = maxDate;
    }

    public Specification<Movie> asSpecification() {
        return MovieFilters.byTitle(title)
                .and(MovieFilters.byGenre(genre))
                .and(MovieFilters.byDate(minDate, maxDate))
                .and(MovieFilters.byScore(minScore, maxScore));
    }
}
