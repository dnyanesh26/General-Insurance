package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Claim;
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
	
	

}
