package com.lti.services;

import java.util.List;

import com.lti.beans.Employee;
import com.lti.exceptions.EmpExcep;

public interface EmpService {

	public int addEmployee(Employee e);
	public List<Employee> getEmpList();
	public boolean updateName(int Id,String Name) throws EmpExcep;
	Employee getEmpbyId(int Id);
	public Employee editSal(int id, double sal);
	
	
}
