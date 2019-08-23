package com.swapi.ws.models;

import com.swapi.service.models.HomeWorld;
import java.util.List;

public class WSHomeWorld {

  String name;
  Integer rotation_period;
  Integer orbital_period;
  Integer diameter;
  String climate;
  String gravity;
  String terrain;
  Integer surface_water;
  Integer population;
  List<String> residents;
  List<String> films;
  String created;
  String edited;
  String url;

  public WSHomeWorld() {}

  public WSHomeWorld(HomeWorld homeWorld) {
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

  public WSHomeWorld setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getRotation_period() {
    return rotation_period;
  }

  public WSHomeWorld setRotation_period(Integer rotation_period) {
    this.rotation_period = rotation_period;
    return this;
  }

  public Integer getOrbital_period() {
    return orbital_period;
  }

  public WSHomeWorld setOrbital_period(Integer orbital_period) {
    this.orbital_period = orbital_period;
    return this;
  }

  public Integer getDiameter() {
    return diameter;
  }

  public WSHomeWorld setDiameter(Integer diameter) {
    this.diameter = diameter;
    return this;
  }

  public String getClimate() {
    return climate;
  }

  public WSHomeWorld setClimate(String climate) {
    this.climate = climate;
    return this;
  }

  public String getGravity() {
    return gravity;
  }

  public WSHomeWorld setGravity(String gravity) {
    this.gravity = gravity;
    return this;
  }

  public String getTerrain() {
    return terrain;
  }

  public WSHomeWorld setTerrain(String terrain) {
    this.terrain = terrain;
    return this;
  }

  public Integer getSurface_water() {
    return surface_water;
  }

  public WSHomeWorld setSurface_water(Integer surface_water) {
    this.surface_water = surface_water;
    return this;
  }

  public Integer getPopulation() {
    return population;
  }

  public WSHomeWorld setPopulation(Integer population) {
    this.population = population;
    return this;
  }

  public List<String> getResidents() {
    return residents;
  }

  public WSHomeWorld setResidents(List<String> residents) {
    this.residents = residents;
    return this;
  }

  public List<String> getFilms() {
    return films;
  }

  public WSHomeWorld setFilms(List<String> films) {
    this.films = films;
    return this;
  }

  public String getCreated() {
    return created;
  }

  public WSHomeWorld setCreated(String created) {
    this.created = created;
    return this;
  }

  public String getEdited() {
    return edited;
  }

  public WSHomeWorld setEdited(String edited) {
    this.edited = edited;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public WSHomeWorld setUrl(String url) {
    this.url = url;
    return this;
  }
}
