package com.lti.dao;

import java.util.List;



import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Employee;
import com.lti.exceptions.EmpExcep;



@Repository
public class EmpDaoImpl implements EmpDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Emp Dao");
		
		em.persist(e);
		return e.getEmpNo();
	}

	@Override
	public List<Employee> getEmpList() {
		
		Query qry=em.createQuery("select e from Employee e ");
		List<Employee> empList=qry.getResultList();
		
		return empList;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	@Transactional
	public boolean updateName(int Id,String Name)throws EmpExcep {
		Employee e = em.find(Employee.class, Id);
		e.setEmpName(Name);
		em.merge(e);
		return true;
		
		
	}

	@Override
	public Employee getEmpbyId(int Id) {
		return(em.find(Employee.class, Id));
	
	}
		
	@Override
	@Transactional
	public Employee editSal(int Id, double sal) {
		Query qry=em.createQuery("update Employee e set e.empSal=:psal where e.empNo=:pid ");
		qry.setParameter("psal", sal);
		qry.setParameter("pid", Id);
		int noRec = qry.executeUpdate();
		Query qry1=em.createQuery("select e from Employee e where e.empNo=:pid");
		qry1.setParameter("pid", Id);
		Employee e=(Employee) qry1.getSingleResult();
		
		return e;
	}

	
		
	
		
}


