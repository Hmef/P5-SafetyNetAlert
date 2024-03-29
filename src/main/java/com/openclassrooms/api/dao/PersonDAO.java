package com.openclassrooms.api.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.openclassrooms.api.data.Data;
import com.openclassrooms.api.model.Person;

@Repository
public class PersonDAO implements DAO<Person>{

	
	@Override
	public List<Person> getAll() {
		
		return Data.getPersons();
	}

	@Override
	public Person save(Person person) {
		
		Data.getPersons().add(person);
		
		
		return person;
	}


	@Override
	public Person update(Person person) {

		Data.getPersons().add(person);
		return person;
	
	}

	@Override
	public void delete(Person person) {
		
		Data.getPersons().remove(person);
		
	}

	
}
