package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Ticket;
import com.lti.dao.TicketDao;
import com.lti.dao.UserDao;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDao dao;

	@Override
	public void addTicket(Ticket ticket) {
		dao.addTicket(ticket);
		
		
	}

	@Override
	public void deleteTicket(int no) {
		dao.deleteTicket(no);
		
	}
}
