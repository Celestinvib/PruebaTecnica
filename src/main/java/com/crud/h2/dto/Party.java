package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="parties")
public class Party {
	
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long id;
	
	private String name;
	
	@ManyToOne
    @JoinColumn(name="party_creator_id")
	private User user;
	
	@ManyToOne
    @JoinColumn(name="game_id")
	private Game game;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
    private List<Message> message;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
    private List<UsersParties> usersParties;
	
	/**Constructors */
	
	public Party() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param partyCreator
	 * @param game
	 */
	public Party(Long id, String name, User partyCreator, Game game) {
		this.id = id;
		this.name = name;
		this.user = partyCreator;
		this.game = game;
	}
	
	/**Getters y Setters*/

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the partyCreator
	 */
	public User getPartyCreator() {
		return user;
	}

	/**
	 * @param partyCreator the partyCreator to set
	 */
	public void setPartyCreator(User partyCreator) {
		this.user = partyCreator;
	}

	/**
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	/**
	 * @return the message
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
	public List<Message> getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	
	
	/**
	 * @return the usersParties
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
	public List<UsersParties> getUsersParties() {
		return usersParties;
	}

	/**
	 * @param usersParties the usersParties to set
	 */
	public void setUsersParties(List<UsersParties> usersParties) {
		this.usersParties = usersParties;
	}

	//Method printing data by console
	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name+ ", partyCreator=" + user+ ", game=" + game+"]";
	}
	
	
	

}
