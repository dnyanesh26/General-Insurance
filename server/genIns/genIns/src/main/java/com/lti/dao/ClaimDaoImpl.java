package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Claim;
import com.lti.beans.User;
import com.lti.exceptions.ClaimExcep;

@Repository
public class ClaimDaoImpl implements ClaimDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public String addClaim(Claim claim) throws ClaimExcep {
		
		em.persist(claim);
		return claim.getStatus();
		
	}
	
	@Override
	@Transactional
	public Claim updateClaim(Claim claim)
	{	
		
		em.merge(claim);
		return claim; 
	}
	
	@Override
	@Transactional
	public String deleteClaim(int id) {
		Claim claim=em.find(Claim.class, id);
		em.remove(claim);
		return ("Claim deleted");
	}
	

}
