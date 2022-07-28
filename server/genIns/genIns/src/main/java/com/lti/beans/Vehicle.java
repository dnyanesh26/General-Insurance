package com.lti.beans;

import java.sql.Date;


import javax.persistence.*;

@Entity
@Table(name="VEHICLES")
public class Vehicle {
	
	@Id
	@Column(name="REGNO")
	private int regNo;
	
	@Column(name="TYPE")
	private String vehType;
	
	@Column(name="MFG")
	private String vehMfg;
	
	@Column(name="MODEL")
	private String vehModel;
	
	@Column(name="DL",unique = true)
	private String drivingLic;
	
	@Column(name="VEHICLECOST")
	private double vehicleCost;
	
	@Column(name="PURCHASEDATE")
	private Date purchDate;
	
	@Column(name="CHASISNO",unique = true)
	private int chasisNumber;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USERID")
	private User user;
	
	

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int regNo, String vehType, String vehMfg, String vehModel, String drivingLic, double vehicleCost,
			Date purchDate, int chasisNumber, User user) {
		super();
		this.regNo = regNo;
		this.vehType = vehType;
		this.vehMfg = vehMfg;
		this.vehModel = vehModel;
		this.drivingLic = drivingLic;
		this.vehicleCost = vehicleCost;
		this.purchDate = purchDate;
		this.chasisNumber = chasisNumber;
		this.user = user;
	}

	public double getVehicleCost() {
		return vehicleCost;
	}

	public void setVehicleCost(double vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User userId) {
		this.user = user;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	public String getVehMfg() {
		return vehMfg;
	}

	public void setVehMfg(String vehMfg) {
		this.vehMfg = vehMfg;
	}

	public String getVehModel() {
		return vehModel;
	}

	public void setVehModel(String vehModel) {
		this.vehModel = vehModel;
	}

	public String getDrivingLic() {
		return drivingLic;
	}

	public void setDrivingLic(String drivingLic) {
		this.drivingLic = drivingLic;
	}

	public Date getPurchDate() {
		return purchDate;
	}

	public void setPurchDate(Date purchDate) {
		this.purchDate = purchDate;
	}

	public int getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(int chasisNumber) {
		this.chasisNumber = chasisNumber;
	}


	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", vehType=" + vehType + ", vehMfg=" + vehMfg + ", vehModel=" + vehModel
				+ ", drivingLic=" + drivingLic + ", vehicleCost=" + vehicleCost + ", purchDate=" + purchDate
				+ ", chasisNumber=" + chasisNumber + ", user=" + user + "]";
	}

	

}
