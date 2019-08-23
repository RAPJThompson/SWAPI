package com.swapi.service.impl;

import com.swapi.dao.HomeWorldDao;
import com.swapi.service.Helpers;
import com.swapi.service.HomeWorldService;
import com.swapi.service.ServiceManager;
import com.swapi.service.models.HomeWorld;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeWorldServiceImpl implements HomeWorldService {

  private HomeWorldDao homeWorldDao;
  private ServiceManager serviceManager;

  public HomeWorldServiceImpl(HomeWorldDao homeWorldDao) {
    this.homeWorldDao = homeWorldDao;
  }

  private ServiceManager getServiceManager() {
    return serviceManager;
  }

  @Autowired
  public HomeWorldServiceImpl setServiceManager(ServiceManager serviceManager) {
    this.serviceManager = serviceManager;
    return this;
  }

  public HomeWorld getHomeWorldByUrl(String homeWorldUrl) {
    Integer id = Helpers.getIdFromUrl(homeWorldUrl);
    return new HomeWorld(homeWorldDao.getHomeWorld(id));
  }

  @Override
  public HomeWorld getHomeWorld(Integer id, Boolean populateChildren) {
    HomeWorld responseHomeWorld = new HomeWorld(homeWorldDao.getHomeWorld(id));
    if (populateChildren) {
      List<String> residents = responseHomeWorld.getResidents();
      for (int i = 0; i < residents.size(); i++) {
        responseHomeWorld.getResidents()
                         .set(i, getServiceManager().getPersonService()
                                                    .getPersonByUrl(residents.get(i))
                                                    .getName());
      }
    }
    return responseHomeWorld;
  }

}
