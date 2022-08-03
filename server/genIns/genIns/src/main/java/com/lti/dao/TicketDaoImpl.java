package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	public void deleteTicket(String no) {
		Ticket t=em.find(Ticket.class, no);
		em.remove(t);
		
	}

	@Override
	public List<Ticket> getTicketById(int id) {
		Query qry=em.createQuery("select u.ticketList from User u where u.userId=:pid ");
		qry.setParameter("pid",id);
		List ticket= new ArrayList<Ticket>();
		ticket=qry.getResultList();
		return ticket;
		
	}

}
