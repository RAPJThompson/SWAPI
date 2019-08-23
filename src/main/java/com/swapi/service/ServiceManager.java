package com.swapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceManager {

  private PersonService personService;
  private HomeWorldService homeWorldService;
  private SpeciesService speciesService;
  private FilmService filmService;
  private SpaceShipService spaceShipService;
  private VehicleService vehicleService;

  public PersonService getPersonService() {
    return personService;
  }

  @Autowired
  public ServiceManager setPersonService(PersonService personService) {
    this.personService = personService;
    return this;
  }

  public HomeWorldService getHomeWorldService() {
    return homeWorldService;
  }

  @Autowired
  public ServiceManager setHomeWorldService(HomeWorldService homeWorldService) {
    this.homeWorldService = homeWorldService;
    return this;
  }

  public SpeciesService getSpeciesService() {
    return speciesService;
  }

  public ServiceManager setSpeciesService(SpeciesService speciesService) {
    this.speciesService = speciesService;
    return this;
  }

  public FilmService getFilmService() {
    return filmService;
  }

  public ServiceManager setFilmService(FilmService filmService) {
    this.filmService = filmService;
    return this;
  }

  public SpaceShipService getSpaceShipService() {
    return spaceShipService;
  }

  public ServiceManager setSpaceShipService(SpaceShipService spaceShipService) {
    this.spaceShipService = spaceShipService;
    return this;
  }

  public VehicleService getVehicleService() {
    return vehicleService;
  }

  public ServiceManager setVehicleService(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
    return this;
  }


}
