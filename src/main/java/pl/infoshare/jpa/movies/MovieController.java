package pl.infoshare.jpa.movies;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.infoshare.jpa.movies.model.Genre;
import pl.infoshare.jpa.movies.model.Movie;
import pl.infoshare.jpa.movies.model.MovieOverview;
import pl.infoshare.jpa.movies.model.MovieUpdateRequest;

@RestController
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/api/movies")
    public Page<Movie> getMovies(MovieSearch movieSearch, Pageable pageable) {
        return movieRepository.findAll(movieSearch.asSpecification(), pageable);
    }

    @GetMapping("/api/popular-movies")
    public Page<MovieOverview> getPopularMovies(Pageable pageable) {
        return movieRepository.findPopularMovies(pageable);
    }

    @GetMapping("/api/movies/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/api/movies")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @PutMapping("/api/movies/{id}")
    @Transactional
    public Movie updateMovie(@PathVariable Long id,
                             @RequestBody MovieUpdateRequest movieUpdateRequest) {
        return movieRepository.findById(id)
                .map(movieUpdateRequest::update)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/api/movies")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Transactional
    public void deleteMovies(@RequestParam Genre genre) {
        movieRepository.deleteAllByGenre(genre);
    }

    @DeleteMapping("/api/movies/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMovie(@PathVariable Long id) {
        movieRepository.deleteById(id);
    }
}
