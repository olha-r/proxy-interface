package proxypatterninterface.service;

import proxypatterninterface.database.Database;
import proxypatterninterface.entities.Person;

public class PersonServiceImpl implements PersonService {

    public PersonServiceImpl() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public Person findPersonById(Long id) {
	Person person = Database.findPersonById(id);
	return person;
    }

}
