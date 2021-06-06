package pl.infoshare.jpa.screens.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.infoshare.jpa.screens.aspots.model.ASpot;
import pl.infoshare.jpa.screens.lanes.model.Lane;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Screen.class)
public abstract class Screen_ {

	public static volatile SetAttribute<Screen, Lane> lanes;
	public static volatile SingularAttribute<Screen, Long> id;
	public static volatile SingularAttribute<Screen, String> title;
	public static volatile SingularAttribute<Screen, ASpot> aSpot;

	public static final String LANES = "lanes";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String A_SPOT = "aSpot";

}

