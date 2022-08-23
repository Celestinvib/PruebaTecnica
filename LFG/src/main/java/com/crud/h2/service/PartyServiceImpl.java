package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPartyDAO;
import com.crud.h2.dto.Game;
import com.crud.h2.dto.Party;

@Service
public class PartyServiceImpl implements IPartyService{
	//We use the methods of the IPartyDAO interface, it is as if we were instantiating.
	@Autowired
	IPartyDAO iPartyDAO;

	@Override
	public List<Party> listParties() {
		
		return iPartyDAO.findAll();
	}

	@Override
	public List<Party> findByGame(String game) {
		
		return iPartyDAO.findByGame(game);
	}

	@Override
	public Party saveParty(Party party) {
		
		return iPartyDAO.save(party);
	}

}
