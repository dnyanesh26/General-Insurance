package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public int addReg(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.println("dao layer");
		em.persist(v);
		return v.getRegNo() ;
		
		
	}
	
	

	
	
	
	

}
