package com.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restservice.bean.Person;
import com.restservice.dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;

	@Override
	public List<Person> getPersons() {
		return personDao.findAll();
	}

	@Override
	public Person getPersonByFirstname(String firstname) {
		return personDao.findByFirstname(firstname);
	}

}
