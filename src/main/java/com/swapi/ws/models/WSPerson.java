package com.swapi.ws.models;


import com.swapi.service.models.Person;
import java.util.List;

public class WSPerson {

  String name;
  Integer height;
  String mass;
  String hair_color;
  String skin_color;
  String eye_color;
  String birth_year;
  String gender;
  String homeworld;
  List<String> films;
  List<String> species;
  List<String> vehicles;
  List<String> starships;
  String created;
  String edited;
  String url;

  public WSPerson() {}

  public WSPerson(Person daoPerson) {
    this.setName(daoPerson.getName())
        .setHeight(daoPerson.getHeight())
        .setMass(daoPerson.getMass())
        .setHair_color(daoPerson.getHair_color())
        .setSkin_color(daoPerson.getSkin_color())
        .setEye_color(daoPerson.getEye_color())
        .setBirth_year(daoPerson.getBirth_year())
        .setGender(daoPerson.getGender())
        .setHomeworld(daoPerson.getHomeworld())
        .setFilms(daoPerson.getFilms())
        .setSpecies(daoPerson.getSpecies())
        .setVehicles(daoPerson.getVehicles())
        .setStarships(daoPerson.getStarships())
        .setCreated(daoPerson.getCreated())
        .setEdited(daoPerson.getEdited())
        .setUrl(daoPerson.getUrl());
  }

  public String getName() {
    return name;
  }

  public WSPerson setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getHeight() {
    return height;
  }

  public WSPerson setHeight(Integer height) {
    this.height = height;
    return this;
  }

  public String getMass() {
    return mass;
  }

  public WSPerson setMass(String mass) {
    this.mass = mass;
    return this;
  }

  public String getHair_color() {
    return hair_color;
  }

  public WSPerson setHair_color(String hair_color) {
    this.hair_color = hair_color;
    return this;
  }

  public String getSkin_color() {
    return skin_color;
  }

  public WSPerson setSkin_color(String skin_color) {
    this.skin_color = skin_color;
    return this;
  }

  public String getEye_color() {
    return eye_color;
  }

  public WSPerson setEye_color(String eye_color) {
    this.eye_color = eye_color;
    return this;
  }

  public String getBirth_year() {
    return birth_year;
  }

  public WSPerson setBirth_year(String birth_year) {
    this.birth_year = birth_year;
    return this;
  }

  public String getGender() {
    return gender;
  }

  public WSPerson setGender(String gender) {
    this.gender = gender;
    return this;
  }

  public String getHomeworld() {
    return homeworld;
  }

  public WSPerson setHomeworld(String homeworld) {
    this.homeworld = homeworld;
    return this;
  }

  public List<String> getFilms() {
    return films;
  }

  public WSPerson setFilms(List<String> films) {
    this.films = films;
    return this;
  }

  public List<String> getSpecies() {
    return species;
  }

  public WSPerson setSpecies(List<String> species) {
    this.species = species;
    return this;
  }

  public List<String> getVehicles() {
    return vehicles;
  }

  public WSPerson setVehicles(List<String> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public List<String> getStarships() {
    return starships;
  }

  public WSPerson setStarships(List<String> starships) {
    this.starships = starships;
    return this;
  }

  public String getCreated() {
    return created;
  }

  public WSPerson setCreated(String created) {
    this.created = created;
    return this;
  }

  public String getEdited() {
    return edited;
  }

  public WSPerson setEdited(String edited) {
    this.edited = edited;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public WSPerson setUrl(String url) {
    this.url = url;
    return this;
  }
}
