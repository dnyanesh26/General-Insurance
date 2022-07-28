package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.User;
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

	@Override
	public List<Vehicle> getVehicle(int id) {
		Query qry=em.createQuery("select v from Vehicle v where v.userId=:pid ");
		qry.setParameter("pid",id);
		List<Vehicle> vehicle=(List<Vehicle>) qry.getResultList();
		return vehicle;
	}
	
	

	
	
	
	

}
