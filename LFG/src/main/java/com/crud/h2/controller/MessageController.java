package com.crud.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Message;
import com.crud.h2.service.MessageServiceImpl;

@RestController
@RequestMapping("/api")
public class MessageController {
	
	@Autowired
	MessageServiceImpl messageServiceImpl;
	
	@PostMapping("/messages")
	public Message saveMessage(@RequestBody Message message) {
		
		return messageServiceImpl.saveMessage(message);
	}
	
	@GetMapping("/messages/{id}")
	public Message messageXID(@PathVariable(name="id") Long id) {
		
		Message item_xid= new Message();
		
		item_xid= messageServiceImpl.messageXID(id);
		
		System.out.println("Artiuclo XID: "+item_xid);
		
		return item_xid;
	}
	
	@PutMapping("/messages/{id}")
	public Message updateMessage(@PathVariable(name="id")Long id,@RequestBody Message message) {
		
		Message messageSelected= new Message();
		Message messageUpdated = new Message();
		
		messageSelected= messageServiceImpl.messageXID(id);
		
		messageSelected.setText(message.getText());

		messageUpdated = messageServiceImpl.updateMessage(messageSelected);
				
		return messageUpdated;
	}
	
	@DeleteMapping("/messages/{id}")
	public void deleteMessage(@PathVariable(name="id")Long id) {
		messageServiceImpl.deleteMessage(id);
	}	

}
