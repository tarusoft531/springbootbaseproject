package com.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.bean.Person;
import com.restservice.service.PersonService;

@RestController
public class PersonRestController {

	@Autowired
	private PersonService personService;

	@GetMapping(value = "/person/getAllPersons.json")
	public List<Person> getAllPersons() {
		return personService.getPersons();
	}

	@GetMapping("/getPersonByName.json/{firstname}")
	public Person getPersonDetailsByName(@PathVariable("firstname") String firstname) {
		return personService.getPersonByFirstname(firstname);
	}
}
