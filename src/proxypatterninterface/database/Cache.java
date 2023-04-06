package proxypatterninterface.database;

import java.util.HashMap;
import java.util.Map;

import proxypatterninterface.entities.Person;

public class Cache {

    private static final Map<Long, Person> PERSONS = new HashMap<>();

    public static Person findPersonById(Long id) {
	return PERSONS.get(id);
    }

    public static void cache(Person person) {
	PERSONS.put(person.getId(), person);
    }

}
