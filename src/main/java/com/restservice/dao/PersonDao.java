package com.restservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.restservice.bean.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

	Person findByFirstname(@Param("firstname") String firstname);

}
