/*package com.horizon.dde.app.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horizon.dde.app.dao.PersonDao;
import com.horizon.dde.app.model.HorizonDDEPersonModel;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	private PersonDao dataDao;
	
	public PersonController(PersonDao dataDao) {
		this.dataDao = dataDao;
	}
	
	@PostMapping
	public HorizonDDEPersonModel insertData(@RequestBody HorizonDDEPersonModel person) throws Exception {
		return person;
//		return dataDao.insertPerson(person);
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> getPersonById(@PathVariable String id) {
		return dataDao.getPersonById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBookById(@PathVariable String id) {
		dataDao.deletePersonById(id);
	}
	
}
*/