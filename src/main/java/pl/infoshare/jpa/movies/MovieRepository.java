package pl.infoshare.jpa.movies;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.infoshare.jpa.movies.model.Genre;
import pl.infoshare.jpa.movies.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    void deleteAllByGenre(Genre genre);
}
