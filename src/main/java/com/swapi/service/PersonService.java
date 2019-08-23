package com.swapi.service;

import com.swapi.service.models.Person;

public interface PersonService {
  Person getPersonByUrl(String personUrl);

  Person getPerson(Integer id, Boolean populateChildren);

}
