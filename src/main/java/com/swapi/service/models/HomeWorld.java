package com.swapi.service.models;

import com.swapi.dao.models.DaoHomeWorld;
import java.util.List;

public class HomeWorld {

  private String name;
  private Integer rotation_period;
  private Integer orbital_period;
  private Integer diameter;
  private String climate;
  private String gravity;
  private String terrain;
  private Integer surface_water;
  private Integer population;
  private List<String> residents;
  private List<String> films;
  private String created;
  private String edited;
  private String url;

  public HomeWorld() {}

  public HomeWorld(DaoHomeWorld homeWorld) {
    this.setName(homeWorld.getName())
        .setRotation_period(homeWorld.getRotation_period())
        .setOrbital_period(homeWorld.getOrbital_period())
        .setDiameter(homeWorld.getDiameter())
        .setClimate(homeWorld.getClimate())
        .setGravity(homeWorld.getGravity())
        .setTerrain(homeWorld.getTerrain())
        .setSurface_water(homeWorld.getSurface_water())
        .setPopulation(homeWorld.getPopulation())
        .setResidents(homeWorld.getResidents())
        .setFilms(homeWorld.getFilms())
        .setCreated(homeWorld.getCreated())
        .setEdited(homeWorld.getEdited())
        .setUrl(homeWorld.getUrl());
  }

  public String getName() {
    return name;
  }

  public HomeWorld setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getRotation_period() {
    return rotation_period;
  }

  public HomeWorld setRotation_period(Integer rotation_period) {
    this.rotation_period = rotation_period;
    return this;
  }

  public Integer getOrbital_period() {
    return orbital_period;
  }

  public HomeWorld setOrbital_period(Integer orbital_period) {
    this.orbital_period = orbital_period;
    return this;
  }

  public Integer getDiameter() {
    return diameter;
  }

  public HomeWorld setDiameter(Integer diameter) {
    this.diameter = diameter;
    return this;
  }

  public String getClimate() {
    return climate;
  }

  public HomeWorld setClimate(String climate) {
    this.climate = climate;
    return this;
  }

  public String getGravity() {
    return gravity;
  }

  public HomeWorld setGravity(String gravity) {
    this.gravity = gravity;
    return this;
  }

  public String getTerrain() {
    return terrain;
  }

  public HomeWorld setTerrain(String terrain) {
    this.terrain = terrain;
    return this;
  }

  public Integer getSurface_water() {
    return surface_water;
  }

  public HomeWorld setSurface_water(Integer surface_water) {
    this.surface_water = surface_water;
    return this;
  }

  public Integer getPopulation() {
    return population;
  }

  public HomeWorld setPopulation(Integer population) {
    this.population = population;
    return this;
  }

  public List<String> getResidents() {
    return residents;
  }

  public HomeWorld setResidents(List<String> residents) {
    this.residents = residents;
    return this;
  }

  public List<String> getFilms() {
    return films;
  }

  public HomeWorld setFilms(List<String> films) {
    this.films = films;
    return this;
  }

  public String getCreated() {
    return created;
  }

  public HomeWorld setCreated(String created) {
    this.created = created;
    return this;
  }

  public String getEdited() {
    return edited;
  }

  public HomeWorld setEdited(String edited) {
    this.edited = edited;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public HomeWorld setUrl(String url) {
    this.url = url;
    return this;
  }
}
