package com.swapi.dao.impl;

import com.swapi.dao.HomeWorldDao;
import com.swapi.dao.models.DaoHomeWorld;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HomeWorldDaoImpl implements HomeWorldDao {

  @Value("${datasource.swapiroot}")
  private String SWAPIROOT;

  private HashMap<Integer, DaoHomeWorld> homeWorlds;
  private RestTemplate restTemplate;

  public HomeWorldDaoImpl() {
    this.homeWorlds = new HashMap<>();
    this.restTemplate = new RestTemplate();
  }

  @Override
  public DaoHomeWorld getHomeWorld(Integer id) {
    if (homeWorlds.get(id) != null) {
      return new DaoHomeWorld(homeWorlds.get(id));
    } else {
      String url = SWAPIROOT + "planets/" + id + "/";
      ResponseEntity getResponse = restTemplate.getForEntity(url, DaoHomeWorld.class);
      if (getResponse.getStatusCode().equals(HttpStatus.OK)) {
        homeWorlds.put(id, (DaoHomeWorld) getResponse.getBody());
        return (DaoHomeWorld) getResponse.getBody();
      }
      return null;
    }
  }
}
