package com.lti.dao;

import com.lti.beans.Ticket;

public interface TicketDao {

	void addTicket(Ticket ticket);

	void deleteTicket(int no);

}
