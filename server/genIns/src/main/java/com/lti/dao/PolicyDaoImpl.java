package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Claim;
import com.lti.beans.Policy;

@Repository
public class PolicyDaoImpl implements PolicyDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void addPolicy(Policy policy) {
		em.persist(policy);
		
		
	}

	@Override
	@Transactional
	public void deletePolicy(int no) {
		Policy policy=em.find(Policy.class,no);
		em.remove(policy);
		
	}

	@Override
	@Transactional
	public List<Claim> getClaim(int id) {
		Query qry=em.createQuery("select p.claimList from Policy p where p.policyNo=:pid ");
		qry.setParameter("pid",id);
		List claim= new ArrayList<Claim>();
		claim=qry.getResultList();
		return claim;
	}

	@Override
	@Transactional
	public void updatePolicy(Policy p) {
		 
		em.merge(p);
		
	}
	
	

}
