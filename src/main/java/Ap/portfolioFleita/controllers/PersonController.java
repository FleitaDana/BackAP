package Ap.portfolioFleita.controllers;

import Ap.portfolioFleita.models.Person;
import Ap.portfolioFleita.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")

public class PersonController {

    @Autowired
    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") Long id) {
        Person person = personService.searchPersonById(id);
        return new ResponseEntity<>(person,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Person> editPerson(@RequestBody Person person){
        Person editPerson=personService.editPerson(person);
        return new ResponseEntity<>(editPerson,HttpStatus.OK);
    }

}
