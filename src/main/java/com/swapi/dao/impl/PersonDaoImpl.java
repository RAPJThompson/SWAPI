package com.swapi.dao.impl;

import com.swapi.dao.PersonDao;
import com.swapi.dao.models.DaoPerson;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PersonDaoImpl implements PersonDao {

  @Value("${datasource.swapiroot}")
  private String SWAPIROOT;

  private HashMap<Integer, DaoPerson> people;
  private RestTemplate restTemplate;

  public PersonDaoImpl() {
    this.restTemplate = new RestTemplate();
    this.people = new HashMap<>();
  }

  @Override
  public DaoPerson getPerson(Integer id) {
    if (people.get(id) != null) {
      return new DaoPerson(people.get(id));
    } else {
      String url = SWAPIROOT + "people/" + id + "/";
      ResponseEntity getResponse = restTemplate.getForEntity(url, DaoPerson.class);
      if (getResponse.getStatusCode().equals(HttpStatus.OK)) {
        people.put(id, (DaoPerson) getResponse.getBody());
        return (DaoPerson) getResponse.getBody();
      }
      return null;
    }
  }

}
