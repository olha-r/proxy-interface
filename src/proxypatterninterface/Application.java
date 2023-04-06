package proxypatterninterface;

import proxypatterninterface.entities.Person;
import proxypatterninterface.service.PersonService;
import proxypatterninterface.service.PersonServiceProxy;

public class Application {

    public static void main(String[] args) {

	PersonService proxy = new PersonServiceProxy();

	Person person = proxy.findPersonById(1L);
	System.out.println(person);

	Person personDansLeCache = proxy.findPersonById(1L);
	System.out.println(personDansLeCache);
    }

}
