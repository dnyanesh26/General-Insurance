package com.lti.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="USERIDSEQ")
	@SequenceGenerator(name="USERIDSEQ",sequenceName="useridseq",allocationSize = 1,initialValue = 1)
	@Column(name="USERID")
	private int userId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="CONTACTNO")
	private double contactNo;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PASSWORD")
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, String email, Date dob, double contactNo, String address, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.contactNo = contactNo;
		this.address = address;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getContactNo() {
		return contactNo;
	}

	public void setContactNo(double contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", dob=" + dob + ", contactNo="
				+ contactNo + ", address=" + address + ", password=" + password + "]";
	}
	
	

}
