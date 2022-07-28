package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void addTicket(Ticket ticket) {
		em.persist(ticket);
		
	}

	@Override
	@Transactional
	public void deleteTicket(int no) {
		Ticket t=em.find(Ticket.class, no);
		em.remove(t);
		
	}

}
