package pl.infoshare.jpa.movies.model;

import java.net.URL;

public interface MovieOverview {
    Long getId();
    String getTitle();
    Genre getGenre();
    URL getThumbnail();
}
