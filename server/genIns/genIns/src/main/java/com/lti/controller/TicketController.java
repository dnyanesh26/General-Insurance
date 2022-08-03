package com.lti.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Ticket;
import com.lti.services.TicketService;

@SuppressWarnings("unused")
@RestController
@CrossOrigin("*")
@RequestMapping("/ticket-api")

public class TicketController {
	@Autowired
	TicketService service;
	
	@PostMapping(path="/addTicket")
	public String addTicket(@RequestBody Ticket ticket)
	{	
		service.addTicket(ticket);
		return("Ticket added");
	}
	
	@DeleteMapping("/deleteTicket")
	public String deleteTicket(@RequestBody  LinkedHashMap t)
	{
		String No =(String)t.get("ticketNo"); 
		service.deleteTicket(No);
		return ("deleted");
	}
	
	@PostMapping("/ticket")
	public List<Ticket> getTicketById(@RequestBody LinkedHashMap t)
	{
		int Id=Integer.parseInt((String)t.get("Id"));
		return (service.getTicketById(Id));
	}
}
