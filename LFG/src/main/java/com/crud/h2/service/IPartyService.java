package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Game;
import com.crud.h2.dto.Party;

public interface IPartyService {
		
		public List<Party> listParties(); //List All 
		
		public List<Party> findByGame(String game); //List All the parties by game
		
		public Party saveParty(Party party);//Save a new party "CREATE"
		
}
