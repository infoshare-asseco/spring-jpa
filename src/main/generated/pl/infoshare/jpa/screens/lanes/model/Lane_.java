package pl.infoshare.jpa.screens.lanes.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.infoshare.jpa.positions.model.Position;
import pl.infoshare.jpa.screens.model.Screen;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lane.class)
public abstract class Lane_ {

	public static volatile SingularAttribute<Lane, Screen> screen;
	public static volatile SetAttribute<Lane, Position> positions;
	public static volatile SingularAttribute<Lane, Long> id;
	public static volatile SingularAttribute<Lane, String> title;

	public static final String SCREEN = "screen";
	public static final String POSITIONS = "positions";
	public static final String ID = "id";
	public static final String TITLE = "title";

}

