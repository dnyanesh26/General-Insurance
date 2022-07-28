package com.lti.beans;

import java.util.List;


import javax.persistence.*;

import com.lti.beans.Employee;

@Entity
@Table(name="DEPT_SPRING")
public class Department {
	
	@Id
	@Column(name="DEPT")
	private int deptId;
	
	@Column(name="DEPTNAME")
	private String deptName;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="department")
	private List<Employee> empList;
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	

}
