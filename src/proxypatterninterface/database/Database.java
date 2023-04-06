package proxypatterninterface.database;

import java.util.HashMap;
import java.util.Map;

import proxypatterninterface.entities.Person;

public class Database {

    private static Long personId = 0L;

    private static final Map<Long, Person> PERSONS = new HashMap<>();

    static {

	Person person1 = new Person();
	personId++;
	person1.setId(personId);
	person1.setFirstName("Frank");
	person1.setLastName("Marshall");
	PERSONS.put(personId, person1);

	Person person2 = new Person();
	personId++;
	person2.setId(personId);
	person2.setFirstName("Laurine");
	person2.setLastName("Da Silva");
	PERSONS.put(personId, person2);

	Person person3 = new Person();
	personId++;
	person3.setId(personId);
	person3.setFirstName("Olha");
	person3.setLastName("Raulet");
	PERSONS.put(personId, person3);

    }

    public static Person findPersonById(Long id) {
	return PERSONS.get(id);
    }

}
