package com.swapi.dao;

import com.swapi.models.Person;

public interface SwapiDao {
  Person getPerson(Integer id);
}
