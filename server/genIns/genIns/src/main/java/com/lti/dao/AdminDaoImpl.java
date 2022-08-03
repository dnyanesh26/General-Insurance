package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Admin;
import com.lti.beans.Claim;
import com.lti.beans.Policy;
import com.lti.beans.Ticket;
import com.lti.beans.Vehicle;

@Repository
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public Admin addAdmin(Admin admin) {
		
		em.persist(admin);
		return admin;
	}

	@Override
	public Admin getAdmin(String email) {
		Query qry=em.createQuery("select a from Admin a where a.userName=:pemail");
		qry.setParameter("pemail",email);
		Admin admin=(Admin) qry.getSingleResult();
		return admin;
		
	}

	@Override
	public List<Policy> getPolicyList() {
		Query qry=em.createQuery("select p from Policy p ");
		List<Policy> policyList=qry.getResultList();
		return policyList;
	}

	@Override
	public List<Vehicle> getVechList() {
		Query qry=em.createQuery("select v from Vehicle v ");
		List<Vehicle> vehicleList=qry.getResultList();
		return vehicleList;
	}

	@Override
	public List<Ticket> getTicketList() {
		Query qry=em.createQuery("select t from Ticket t ");
		List<Ticket> ticketList=qry.getResultList();
		return ticketList;
		
	}

	@Override
	public List<Claim> getClaimList() {
		Query qry=em.createQuery("select c from Claim c ");
		List<Claim> claimList=qry.getResultList();
		return claimList;
	}

	@Override
	@Transactional
	public Claim appClaim(Claim c) {
		em.merge(c);
		return c;
	}

}
