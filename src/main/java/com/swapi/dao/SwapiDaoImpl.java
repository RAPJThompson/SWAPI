package com.swapi.dao;

import com.swapi.models.HomeWorld;
import com.swapi.models.Person;
import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SwapiDaoImpl implements SwapiDao {

  private final static String SWAPIROOT = "https://swapi.co/api/";
  HashMap<Integer, Person> people;
  HashMap<Integer, HomeWorld> homeWorlds;
  private RestTemplate restTemplate;
//  HashMap<Integer, Film> films;
//  HashMap<Integer, Species> species;
//  HashMap<Integer, Vehicle> vehicles;
//  HashMap<Integer, Starship> starships;

  public SwapiDaoImpl() {
    this.restTemplate = new RestTemplate();
    this.people = new HashMap<>();
    this.homeWorlds = new HashMap<>();
  }

  public Person getPerson(Integer id) {
    if (people.get(id) != null) {
      return people.get(id);
    } else {
      String url = SWAPIROOT + "/people/" + id + "/";
      ResponseEntity getResponse = restTemplate.getForEntity(url, Person.class);
      if (getResponse.getStatusCode().equals(HttpStatus.OK)) {
        people.put(id, (Person) getResponse.getBody());
        return (Person) getResponse.getBody();
      }
      return null;
    }
  }


}

