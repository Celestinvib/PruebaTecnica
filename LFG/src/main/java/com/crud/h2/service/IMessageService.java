package com.crud.h2.service;

import com.crud.h2.dto.Message;

public interface IMessageService {

	public Message saveMessage(Message message);//Save a new part "CREATE"
	
	public Message messageXID(Long id); //Read data from a part "READ"
			
	public Message updateMessage(Message message); //Update part data "UPDATE"
	
	public void deleteMessage(Long id);// Delete a part via id "DELETE"
}
