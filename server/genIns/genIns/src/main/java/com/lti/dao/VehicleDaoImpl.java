package com.lti.dao;

import java.util.ArrayList;
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
	@Transactional
	public List<Vehicle> getVehicle(int id) {
		Query qry=em.createQuery("select u.vechList from User u where u.userId=:pid ");
		qry.setParameter("pid",id);
		List vehicle= new ArrayList<Vehicle>();
		vehicle=qry.getResultList();
		return vehicle;
	}
	
	

	
	
	
	

}
