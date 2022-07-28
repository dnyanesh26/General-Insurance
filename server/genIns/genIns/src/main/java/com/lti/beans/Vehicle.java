package com.lti.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
	private int vehModel;
	
	@Column(name="DL")
	private int drivingLic;
	
	@Column(name="PURCHASEDATE")
	private Date purchDate;
	
	@Column(name="CHASISNO")
	private int chasisNumber;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int regNo, String vehType, String vehMfg, int vehModel, int drivingLic, Date purchDate,
			int chasisNumber) {
		super();
		this.regNo = regNo;
		this.vehType = vehType;
		this.vehMfg = vehMfg;
		this.vehModel = vehModel;
		this.drivingLic = drivingLic;
		this.purchDate = purchDate;
		this.chasisNumber = chasisNumber;
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

	public int getVehModel() {
		return vehModel;
	}

	public void setVehModel(int vehModel) {
		this.vehModel = vehModel;
	}

	public int getDrivingLic() {
		return drivingLic;
	}

	public void setDrivingLic(int drivingLic) {
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

	

}
