package com.swapi.ws;

import com.swapi.service.*;
import com.swapi.ws.models.WSFilm;
import com.swapi.ws.models.WSHomeWorld;
import com.swapi.ws.models.WSPerson;
import com.swapi.ws.models.WSSpecies;
import com.swapi.ws.models.WSStarship;
import com.swapi.ws.models.WSVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("swapi")
public class swapiController {

  private PersonService personService;
  private HomeWorldService homeWorldService;
  private SpeciesService speciesService;
  private FilmService filmService;
  private StarShipService starShipService;
  private VehicleService vehicleService;

  @Autowired
  public swapiController(
      PersonService personService,
      HomeWorldService homeWorldService,
      SpeciesService speciesService,
      FilmService filmService,
      StarShipService starShipService,
      VehicleService vehicleService
  ) {
    this.personService = personService;
    this.homeWorldService = homeWorldService;
    this.speciesService = speciesService;
    this.filmService = filmService;
    this.starShipService = starShipService;
    this.vehicleService = vehicleService;
  }

  @RequestMapping(
      value = "/people/{id}",
      method = RequestMethod.GET
  )
  public WSPerson getPerson(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "false") Boolean populateChildren) {
    System.out.println("GET person id: " + id);
    System.out.println("GET person populateChildren: " + populateChildren);
    return new WSPerson(personService.getPerson(id, populateChildren));
  }

  @RequestMapping(
      value = "/planets/{id}",
      method = RequestMethod.GET
  )
  public WSHomeWorld getHomeWorld(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "false") Boolean populateChildren) {
    return new WSHomeWorld(homeWorldService.getHomeWorld(id, populateChildren));
  }

  @RequestMapping(
      value = "/films/{id}",
      method = RequestMethod.GET
  )
  public WSFilm getFilm(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "false") Boolean populateChildren) {
    return null;
  }

  @RequestMapping(
      value = "/species/{id}",
      method = RequestMethod.GET
  )
  public WSSpecies getSpecies(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "false") Boolean populateChildren) {
    return null;
  }

  @RequestMapping(
      value = "/vehicles/{id}",
      method = RequestMethod.GET
  )
  public WSVehicle getVehicle(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "false") Boolean populateChildren) {
    return null;
  }

  @RequestMapping(
      value = "/starships/{id}",
      method = RequestMethod.GET
  )
  public WSStarship getStarship(@PathVariable Integer id, @RequestParam(required = false, defaultValue = "false") Boolean populateChildren) {
    return null;
  }

}
