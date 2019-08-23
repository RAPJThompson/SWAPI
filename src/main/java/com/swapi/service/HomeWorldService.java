package com.swapi.service;

import com.swapi.service.models.HomeWorld;

public interface HomeWorldService {
  HomeWorld getHomeWorldByUrl(String homeWorldUrl);

  HomeWorld getHomeWorld(Integer id, Boolean populateChildren);
}
