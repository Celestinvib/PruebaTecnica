package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IUserDAO;
import com.crud.h2.dto.User;

@Service
public class UserServiceImpl implements IUserService{
	//We use the methods of the IUserDAO interface, it is as if we were instantiating.
	@Autowired
	IUserDAO iUserDAO;

	@Override
	public List<User> listUsers() {
		
		return iUserDAO.findAll();
	}

	@Override
	public User saveUser(User user) {
		
		return iUserDAO.save(user);
	}
	
	@Override
	public User userXID(Long id) {
		return iUserDAO.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		
		return iUserDAO.save(user);
	}


	
	
}
