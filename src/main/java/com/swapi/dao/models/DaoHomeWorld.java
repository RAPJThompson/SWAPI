package com.swapi.dao.models;

import java.util.ArrayList;
import java.util.List;

public class DaoHomeWorld {

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

  public DaoHomeWorld() {}

  public DaoHomeWorld(DaoHomeWorld homeWorld) {
    this.setName(homeWorld.getName())
        .setRotation_period(homeWorld.getRotation_period())
        .setOrbital_period(homeWorld.getOrbital_period())
        .setDiameter(homeWorld.getDiameter())
        .setClimate(homeWorld.getClimate())
        .setGravity(homeWorld.getGravity())
        .setTerrain(homeWorld.getTerrain())
        .setSurface_water(homeWorld.getSurface_water())
        .setPopulation(homeWorld.getPopulation())
        .setResidents(new ArrayList<>(homeWorld.getResidents()))
        .setFilms(new ArrayList<>(homeWorld.getFilms()))
        .setCreated(homeWorld.getCreated())
        .setEdited(homeWorld.getEdited())
        .setUrl(homeWorld.getUrl());
  }

  public String getName() {
    return name;
  }

  public DaoHomeWorld setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getRotation_period() {
    return rotation_period;
  }

  public DaoHomeWorld setRotation_period(Integer rotation_period) {
    this.rotation_period = rotation_period;
    return this;
  }

  public Integer getOrbital_period() {
    return orbital_period;
  }

  public DaoHomeWorld setOrbital_period(Integer orbital_period) {
    this.orbital_period = orbital_period;
    return this;
  }

  public Integer getDiameter() {
    return diameter;
  }

  public DaoHomeWorld setDiameter(Integer diameter) {
    this.diameter = diameter;
    return this;
  }

  public String getClimate() {
    return climate;
  }

  public DaoHomeWorld setClimate(String climate) {
    this.climate = climate;
    return this;
  }

  public String getGravity() {
    return gravity;
  }

  public DaoHomeWorld setGravity(String gravity) {
    this.gravity = gravity;
    return this;
  }

  public String getTerrain() {
    return terrain;
  }

  public DaoHomeWorld setTerrain(String terrain) {
    this.terrain = terrain;
    return this;
  }

  public Integer getSurface_water() {
    return surface_water;
  }

  public DaoHomeWorld setSurface_water(Integer surface_water) {
    this.surface_water = surface_water;
    return this;
  }

  public Integer getPopulation() {
    return population;
  }

  public DaoHomeWorld setPopulation(Integer population) {
    this.population = population;
    return this;
  }

  public List<String> getResidents() {
    return residents;
  }

  public DaoHomeWorld setResidents(List<String> residents) {
    this.residents = residents;
    return this;
  }

  public List<String> getFilms() {
    return films;
  }

  public DaoHomeWorld setFilms(List<String> films) {
    this.films = films;
    return this;
  }

  public String getCreated() {
    return created;
  }

  public DaoHomeWorld setCreated(String created) {
    this.created = created;
    return this;
  }

  public String getEdited() {
    return edited;
  }

  public DaoHomeWorld setEdited(String edited) {
    this.edited = edited;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public DaoHomeWorld setUrl(String url) {
    this.url = url;
    return this;
  }
}
