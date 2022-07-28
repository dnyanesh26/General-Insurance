package com.lti.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.lti.beans.Department;
import com.lti.beans.Employee;

@Repository
public class DeptDaoImpl implements DeptDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public Department addDept(Department d) {
		// TODO Auto-generated method stub
		em.persist(d);
		return d;
	}


	@Override
	public Department getDeptbyId(int id) {
		Query qry=em.createQuery("select d from Department d where d.deptId=:pid");
		qry.setParameter("pid", id);
		Department d=(Department) qry.getSingleResult();
		return d;
	}


	@Override
	public List getDeptlist() {
		Query qry=em.createQuery("select d from Department d");
		List dept= new ArrayList<Department>();
		dept=qry.getResultList();
		return dept;
	}


	@Override
	@Transactional
	public void deleteDept(Department d) {
		
		em.remove(d);
	}

}
