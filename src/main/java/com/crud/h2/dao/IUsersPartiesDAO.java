package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.UsersParties;

public interface IUsersPartiesDAO extends JpaRepository<UsersParties, Long>{ 

}
