package com.swapi.ws;

import com.swapi.models.Person;
import com.swapi.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("swapi")
public class swapiController {

  private PersonServiceImpl personService;

  @Autowired
  public swapiController(PersonServiceImpl personService) {
    this.personService = personService;
  }

  @RequestMapping("/people/{id}")
  public Person getPerson(@PathVariable Integer id) {
    System.out.println("GET person id: " + id);
    return personService.getPerson(id);
  }

}
