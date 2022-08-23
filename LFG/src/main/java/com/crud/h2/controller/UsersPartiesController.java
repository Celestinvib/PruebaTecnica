package com.crud.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.UsersParties;
import com.crud.h2.service.UsersPartiesServiceImpl;

@RestController
@RequestMapping("/api")
public class UsersPartiesController {
	@Autowired
	UsersPartiesServiceImpl usersPartiesServiceImpl;
	
	@PostMapping("/users-parties")
	public UsersParties saveUserParty(@RequestBody UsersParties usersParties) {
		
		return usersPartiesServiceImpl.saveUsersParties(usersParties);
	}
	
	@DeleteMapping("/users-parties/{id}")
	public void deleteUserParty(@PathVariable(name="id")Long id) {
		usersPartiesServiceImpl.deleteUsersParties(id);
	}	

}
