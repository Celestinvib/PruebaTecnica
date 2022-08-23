package com.crud.h2.service;

import com.crud.h2.dto.UsersParties;

public interface IUsersPartiesService {
	
	public UsersParties saveUsersParties(UsersParties usersParties);//Save a new usersParties "CREATE"
	
	public void deleteUsersParties(Long id);// Delete a usersParties via id "DELETE"
}
