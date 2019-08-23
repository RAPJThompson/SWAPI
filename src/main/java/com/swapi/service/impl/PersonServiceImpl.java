package com.swapi.service.impl;

import com.swapi.dao.PersonDao;
import com.swapi.service.Helpers;
import com.swapi.service.PersonService;
import com.swapi.service.ServiceManager;
import com.swapi.service.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {

  private PersonDao personDao;
  private ServiceManager serviceManager;

  @Autowired
  public PersonServiceImpl(PersonDao personDao) {
    this.personDao = personDao;
  }

  private ServiceManager getServiceManager() {
    return serviceManager;
  }

  @Autowired
  public PersonServiceImpl setServiceManager(ServiceManager serviceManager) {
    this.serviceManager = serviceManager;
    return this;
  }

  @Override
  public Person getPersonByUrl(String personUrl) {
    Integer id = Helpers.getIdFromUrl(personUrl);
    return getPerson(id, false);
  }

  public Person getPerson(Integer id, Boolean populateChildren) {
    Person responsePerson = new Person(personDao.getPerson(id));
    if (populateChildren) {
      responsePerson.setHomeworld(
          getServiceManager().getHomeWorldService().getHomeWorldByUrl(responsePerson.getHomeworld())
                             .getName());
    }
    return responsePerson;
  }


}