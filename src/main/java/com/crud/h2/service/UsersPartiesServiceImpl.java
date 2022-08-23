package com.crud.h2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IUsersPartiesDAO;
import com.crud.h2.dto.UsersParties;

@Service
public class UsersPartiesServiceImpl implements IUsersPartiesService{
	//We use the methods of the IPartyDAO interface, it is as if we were instantiating.
	@Autowired
	IUsersPartiesDAO iUsersPartiesDAO;
	
	@Override
	public UsersParties saveUsersParties(UsersParties usersParties) {
		
		return iUsersPartiesDAO.save(usersParties);
	}

	@Override
	public void deleteUsersParties(Long id) {
		
		iUsersPartiesDAO.deleteById(id);
	}

}
