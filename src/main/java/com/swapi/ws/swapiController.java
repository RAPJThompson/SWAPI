package com.swapi.ws;

import com.swapi.service.HomeWorldService;
import com.swapi.service.PersonService;
import com.swapi.ws.models.WSHomeWorld;
import com.swapi.ws.models.WSPerson;
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

  @Autowired
  public swapiController(PersonService personService, HomeWorldService homeWorldService) {
    this.personService = personService;
    this.homeWorldService = homeWorldService;
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


  //  Film getFilm(Integer id, Boolean populateChildren);
  //  Species getSpecies(Integer id, Boolean populateChildren);
  //  Vehicle getVehicle(Integer id, Boolean populateChildren);
  //  WSStarship getStarship(Integer id, Boolean populateChildren);
}
