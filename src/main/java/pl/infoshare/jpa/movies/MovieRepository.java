package pl.infoshare.jpa.movies;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import pl.infoshare.jpa.movies.model.Genre;
import pl.infoshare.jpa.movies.model.Movie;
import pl.infoshare.jpa.movies.model.MovieOverview;

public interface MovieRepository extends JpaRepository<Movie, Long>, JpaSpecificationExecutor<Movie> {
    @Query("select m from Movie m where m.releaseDate > '2010-01-01' and m.score >= 7.0")
    Page<MovieOverview> findPopularMovies(Pageable pageable);

    Page<MovieOverview> findAllByTitleContaining(String title, Pageable pageable);

    Page<MovieOverview> findAllProjectedBy(Pageable pageable);

    Page<MovieOverview> findAllProjectedBy(@Nullable Specification<Movie> spec, Pageable pageable);

    void deleteAllByGenre(Genre genre);
}
