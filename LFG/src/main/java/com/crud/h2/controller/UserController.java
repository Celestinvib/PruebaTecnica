package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.User;
import com.crud.h2.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@GetMapping("/users")
	public List<User> listAllUsers(){
		return userServiceImpl.listUsers();
	}
	
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		
		return userServiceImpl.saveUser(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable(name="id")Long id,@RequestBody User user) {
		
		User userSelected= new User();
		User userUpdated = new User();
		
		userSelected= userServiceImpl.userXID(id);
		
		userSelected.setUsername(user.getUsername());
		userSelected.setEmail(user.getEmail());
		userSelected.setPassword(user.getPassword());
		userSelected.setSteamUser(user.getSteamUser());
	
		userUpdated = userServiceImpl.updateUser(userSelected);
				
		return userSelected;
	}
	
}
