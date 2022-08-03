package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Policy;
import com.lti.beans.User;
import com.lti.exceptions.UserException;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public String addUser(User user) throws UserException {
		
		em.persist(user);
		return user.getName();
		
	}

	@Override
	@Transactional
	public User getUser(String email) throws UserException{
		Query qry=em.createQuery("select u from User u where u.email=:pemail");
		qry.setParameter("pemail",email);
		User user=(User) qry.getSingleResult();
		System.out.println(user);
		return user;
	}
	
	@Override
	@Transactional
	public User updateUser(User user)
	{	
		
		em.merge(user);
		return user; 
	}

	@Override
	@Transactional
	public String deleteUser(int id) {
		User user=em.find(User.class, id);
		em.remove(user);
		return ("User deleted");
	}

	@Override
	@Transactional
	public List<Policy> getPolicy(int id) {
		Query qry=em.createQuery("select u.policyList from User u where u.userId=:pid ");
		qry.setParameter("pid",id);
		List policy= new ArrayList<Policy>();
		policy=qry.getResultList();
		return policy;
		
	}

}
