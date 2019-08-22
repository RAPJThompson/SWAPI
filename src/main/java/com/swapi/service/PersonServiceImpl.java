package com.swapi.service;

import com.swapi.dao.SwapiDao;
import com.swapi.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {

  private SwapiDao swapiDao;

  @Autowired
  public PersonServiceImpl(SwapiDao swapiDao) {
    this.swapiDao = swapiDao;
  }

  public Person getPerson(Integer id) {
    return swapiDao.getPerson(id);
  }

}