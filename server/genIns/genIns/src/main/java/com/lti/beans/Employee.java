package com.lti.beans;

import javax.persistence.*;



@Entity
@Table(name="EMP_SPRING")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="EMPSEQ")
	@SequenceGenerator(name="EMPSEQ",sequenceName="empseq",allocationSize = 1,initialValue = 101)
	@Column(name="EMPNO")
	private int empNo;
	
	@Column(name="EMPNAME")
	private String empName;
	
	@Column(name="EMPSAL")
	private double empSal;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="DEPTID")
	private Department department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	
	public Employee( String empName, double empSal, Department department) {
		
		
		this.empName = empName;
		this.empSal = empSal;
		this.department = department;
	}

	public Employee(String empName, double empSal) {
		
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

}
