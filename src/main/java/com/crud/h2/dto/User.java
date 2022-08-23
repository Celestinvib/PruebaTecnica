package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class User {
	
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find the last value and increment from final id of db
	private Long id;
	
	private String username;
	
	private String email;
	
	private String password;
		
	private String steamUser;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Message> message;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Party> party;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<UsersParties> usersParties;
	
	/**Constructors */
	
	public User() {
		
	}

	/**
	 * @param id
	 * @param username
	 * @param email
	 * @param password
	 */
	public User(Long id, String username, String email, String password) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the steamUser
	 */
	public String getSteamUser() {
		return steamUser;
	}

	/**
	 * @param steamUser the steamUser to set
	 */
	public void setSteamUser(String steamUser) {
		this.steamUser = steamUser;
	}

	/**
	 * @return the message
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public List<UsersParties> getUsersParties() {
		return usersParties;
	}

	/**
	 * @param usersParties the usersParties to set
	 */
	public void setUsersParties(List<UsersParties> usersParties) {
		this.usersParties = usersParties;
	}

	/**
	 * @return the party
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public List<Party> getParty() {
		return party;
	}

	/**
	 * @param party the party to set
	 */
	public void setParty(List<Party> party) {
		this.party = party;
	}
	

	//Method printing data by console
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username+ ", email=" + email+ ", password=" + password+ ", steamUser=" + steamUser+"]";
	}
	
	
	
}
