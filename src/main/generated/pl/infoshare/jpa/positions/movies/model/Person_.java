package pl.infoshare.jpa.positions.movies.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, String> surname;
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, LocalDate> birthDate;

	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String BIRTH_DATE = "birthDate";

}

