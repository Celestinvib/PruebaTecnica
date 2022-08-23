package com.crud.h2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IMessageDAO;
import com.crud.h2.dto.Message;

@Service
public class MessageServiceImpl implements IMessageService{
	//We use the methods of the IPartyDAO interface, it is as if we were instantiating.
	@Autowired
	IMessageDAO iMessageDAO;

	@Override
	public Message saveMessage(Message message) {
	
		return iMessageDAO.save(message);
	}

	@Override
	public Message messageXID(Long id) {

		return iMessageDAO.findById(id).get();

	}

	@Override
	public Message updateMessage(Message message) {
		
		return iMessageDAO.save(message);
	}

	@Override
	public void deleteMessage(Long id) {
	
		iMessageDAO.deleteById(id);
	}
	
	
}
