package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Game;
import com.crud.h2.dto.Party;

import com.crud.h2.service.PartyServiceImpl;

@RestController
@RequestMapping("/api")
public class PartyController {
	@Autowired
	PartyServiceImpl partyServiceImpl;
	
	@GetMapping("/parties")
	public List<Party> listParties(){
		return partyServiceImpl.listParties();
	}
	
	//List parties by game
	@GetMapping("/parties/{game}")
	public List<Party> listPartiesByGame(@PathVariable(name="game") String game) {
	    return partyServiceImpl.findByGame(game);
//		List<Party> parties = listParties();
//		List<Party> partiesWGame = Arrays.asList() ;
//	
//		for (int i = 0; i < parties.size(); i++) {
//			if(parties.get(i).getGame().getName().equals(game)) {
//				partiesWGame.add(parties.get(i));
//			}
//		}
//		
//		return partiesWGame;
	}
	
	@PostMapping("/parties")
	public Party saveParty(@RequestBody Party party) {
		
		return partyServiceImpl.saveParty(party);
	}
	
}
