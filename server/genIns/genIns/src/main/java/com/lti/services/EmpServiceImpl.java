package com.lti.services;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.lti.beans.Employee;
import com.lti.dao.EmpDao;
import com.lti.exceptions.EmpExcep;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao dao;
	
	@Override
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Emp Service");
		
		
		return dao.addEmployee(e);
	}
	
	@Override
	public Employee getEmpbyId(int Id)
	{
		return dao.getEmpbyId(Id);
	}
	
	public List<Employee> getEmpList()
	{
		List<Employee> empList=dao.getEmpList();
		return empList;
		
	}
	
	public boolean updateName(int Id,String Name) throws EmpExcep
	{
		if(Name!=null | Name!="" )
		{
			return dao.updateName(Id,Name);
		}
		else
			return false;
		
		
		
	}

	@Override
	public Employee editSal(int id, double sal) {
		
		return dao.editSal(id, sal);
	}


		

}
