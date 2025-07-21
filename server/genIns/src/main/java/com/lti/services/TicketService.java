package com.lti.services;

import java.util.List;

import com.lti.beans.Ticket;

public interface TicketService {

	void addTicket(Ticket ticket);

	void deleteTicket(String no);

	List<Ticket> getTicketById(int id);

}
