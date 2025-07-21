package com.lti.dao;

import java.util.List;

import com.lti.beans.Ticket;

public interface TicketDao {

	void addTicket(Ticket ticket);

	void deleteTicket(String no);

	List<Ticket> getTicketById(int id);

}
