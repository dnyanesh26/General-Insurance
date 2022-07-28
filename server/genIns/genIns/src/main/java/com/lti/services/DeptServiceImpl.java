package com.lti.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Department;
import com.lti.dao.DeptDao;
import com.lti.dao.DeptDaoImpl;
@Service("deptService")
public class DeptServiceImpl implements DeptService {

	
	@Autowired
	DeptDao dao;
	
	@Override
	public Department addDept(Department d) {
		
		
		return dao.addDept(d);
	}

	@Override
	public Department getDeptbyId(int id) {
		
		return dao.getDeptbyId(id);
	}

	@Override
	public List getDeptlist() {
		
		return dao.getDeptlist();
	}

	@Override
	public void deleteDept(Department d) {
		 
		dao.deleteDept(d);
		
	}

}
