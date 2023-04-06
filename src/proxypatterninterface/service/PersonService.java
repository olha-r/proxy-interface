package proxypatterninterface.service;

import proxypatterninterface.entities.Person;

public interface PersonService {

    Person findPersonById(Long id);

}
