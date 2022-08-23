package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.User;

public interface IUserService {
		
		public List<User> listUsers(); //List All 
		
		public User saveUser(User user);//Save a new user "CREATE"
		
		public User userXID(Long id); //Read data from a user "READ"

		public User updateUser(User user); //Update user data "UPDATE"
		

		
}
