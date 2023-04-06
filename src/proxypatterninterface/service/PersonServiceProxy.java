package proxypatterninterface.service;

import proxypatterninterface.database.Cache;
import proxypatterninterface.entities.Person;

public class PersonServiceProxy implements PersonService {

    private PersonService service;

    public PersonServiceProxy() {
	this.service = new PersonServiceImpl();
    }

    @Override
    public Person findPersonById(Long id) {
	if (Cache.findPersonById(id) != null) {
	    System.out.println("Person déjà dans le cache");
	    Person person = Cache.findPersonById(id);
	    System.out.println(
		    "Je retourne le resultat du cache "
			    + person);

	} else {
	    System.out.println(
		    "N'est pas encore dans le cache");
	    System.out.println(
		    "Je vais chercher la persone dans la database");
	    Person person = service.findPersonById(id);
	    System.out.println("Je la met dans le cache");
	    Cache.cache(person);
	    System.out.println(
		    "Je retourne le resultat du database "
			    + person);

	}
	return null;
    }

}
