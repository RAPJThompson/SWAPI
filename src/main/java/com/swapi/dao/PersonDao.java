package com.swapi.dao;

import com.swapi.dao.models.DaoPerson;

public interface PersonDao {
  DaoPerson getPerson(Integer id);
}
