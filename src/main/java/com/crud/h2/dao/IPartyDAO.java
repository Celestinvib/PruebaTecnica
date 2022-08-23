package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Game;
import com.crud.h2.dto.Party;

public interface IPartyDAO  extends JpaRepository<Party, Long>{
	public List<Party> findByGame(String game);
}
