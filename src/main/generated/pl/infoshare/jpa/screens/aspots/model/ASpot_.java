package pl.infoshare.jpa.screens.aspots.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.infoshare.jpa.positions.movies.model.Movie;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ASpot.class)
public abstract class ASpot_ {

	public static volatile SingularAttribute<ASpot, ASpotSize> size;
	public static volatile SingularAttribute<ASpot, Movie> movie;
	public static volatile SingularAttribute<ASpot, Long> id;

	public static final String SIZE = "size";
	public static final String MOVIE = "movie";
	public static final String ID = "id";

}

