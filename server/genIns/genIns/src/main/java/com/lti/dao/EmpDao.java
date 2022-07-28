package com.lti.dao;

import java.util.List;

import com.lti.beans.Employee;
import com.lti.exceptions.EmpExcep;


public interface EmpDao {
	
	public int addEmployee (Employee e);

	public List<Employee> getEmpList();

	boolean updateName(int Id, String Name) throws EmpExcep;

	public Employee getEmpbyId(int Id);

	Employee editSal(int id, double sal);

	

}
