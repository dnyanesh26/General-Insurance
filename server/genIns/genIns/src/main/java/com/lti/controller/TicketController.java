package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Ticket;
import com.lti.beans.User;
import com.lti.beans.Vehicle;
import com.lti.exceptions.UserException;
import com.lti.services.TicketService;
import com.lti.services.UserService;

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
	
}
