package com.restservice.service;

import java.util.List;

import com.restservice.bean.Person;

public interface PersonService {

	public List<Person> getPersons();
	
	public Person getPersonByFirstname(String firstname);
}
