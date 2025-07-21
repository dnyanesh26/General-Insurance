package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLES")
public class Vehicle {
	
	@Id
	@Column(name="VEHICLE_REGNO")
	private String vehRegNo;
	
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
	
	@Column(name="VEHICLEAGE")
	private int vehicleAge;
	
	@Column(name="CHASISNO",unique = true)
	private String chasisNumber;
		
	@OneToOne(mappedBy="vehicle")
	private Policy policy ;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USERID")
	private User user;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String vehRegNo, String vehType, String vehMfg, String vehModel, String drivingLic,
			double vehicleCost, int vehicleAge, String chasisNumber, User user) {
		super();
		this.vehRegNo = vehRegNo;
		this.vehType = vehType;
		this.vehMfg = vehMfg;
		this.vehModel = vehModel;
		this.drivingLic = drivingLic;
		this.vehicleCost = vehicleCost;
		this.vehicleAge = vehicleAge;
		this.chasisNumber = chasisNumber;
		this.user = user;
	}

	public String getVehRegNo() {
		return vehRegNo;
	}

	public void setVehRegNo(String vehRegNo) {
		this.vehRegNo = vehRegNo;
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

	public double getVehicleCost() {
		return vehicleCost;
	}

	public void setVehicleCost(double vehicleCost) {
		this.vehicleCost = vehicleCost;
	}

	public int getVehicleAge() {
		return vehicleAge;
	}

	public void setVehicleAge(int vehicleAge) {
		this.vehicleAge = vehicleAge;
	}

	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Vehicle [vehRegNo=" + vehRegNo + ", vehType=" + vehType + ", vehMfg=" + vehMfg + ", vehModel="
				+ vehModel + ", drivingLic=" + drivingLic + ", vehicleCost=" + vehicleCost + ", vehicleAge="
				+ vehicleAge + ", chasisNumber=" + chasisNumber + ", user=" + user + "]";
	}

}
