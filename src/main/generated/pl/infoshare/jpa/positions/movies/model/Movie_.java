package pl.infoshare.jpa.positions.movies.model;

import java.time.Duration;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Movie.class)
public abstract class Movie_ extends pl.infoshare.jpa.positions.model.Position_ {

	public static volatile SingularAttribute<Movie, Duration> duration;
	public static volatile SingularAttribute<Movie, Person> director;

	public static final String DURATION = "duration";
	public static final String DIRECTOR = "director";

}

