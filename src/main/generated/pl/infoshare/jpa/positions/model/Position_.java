package pl.infoshare.jpa.positions.model;

import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.infoshare.jpa.screens.lanes.model.Lane;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Position.class)
public abstract class Position_ {

	public static volatile SingularAttribute<Position, BigDecimal> score;
	public static volatile SingularAttribute<Position, URL> thumbnail;
	public static volatile SingularAttribute<Position, LocalDate> releaseDate;
	public static volatile SingularAttribute<Position, Genre> genre;
	public static volatile SetAttribute<Position, Lane> lanes;
	public static volatile SingularAttribute<Position, String> description;
	public static volatile SingularAttribute<Position, Long> id;
	public static volatile SingularAttribute<Position, String> title;
	public static volatile SingularAttribute<Position, UUID> uuid;

	public static final String SCORE = "score";
	public static final String THUMBNAIL = "thumbnail";
	public static final String RELEASE_DATE = "releaseDate";
	public static final String GENRE = "genre";
	public static final String LANES = "lanes";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String UUID = "uuid";

}

