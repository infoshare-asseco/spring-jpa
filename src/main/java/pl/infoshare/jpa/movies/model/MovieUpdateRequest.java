package pl.infoshare.jpa.movies.model;

import lombok.Value;

import java.math.BigDecimal;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;

@Value
public class MovieUpdateRequest {

    String title;
    String description;
    Genre genre;
    Duration duration;
    LocalDate releaseDate;
    BigDecimal score;
    URL thumbnail;
    String directorName;
    String directorSurname;
    LocalDate directorBirthOfDate;

    public Movie update(Movie movie) {
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setGenre(genre);
        movie.setDuration(duration);
        movie.setReleaseDate(releaseDate);
        movie.setScore(score);
        movie.setThumbnail(thumbnail);
        movie.getDirector().setName(directorName);
        movie.getDirector().setSurname(directorSurname);
        movie.getDirector().setBirthDate(directorBirthOfDate);

        return movie;
    }

}
