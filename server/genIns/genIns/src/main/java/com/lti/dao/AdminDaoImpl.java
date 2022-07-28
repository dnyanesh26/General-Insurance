package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Admin;
import com.lti.beans.User;

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

}
