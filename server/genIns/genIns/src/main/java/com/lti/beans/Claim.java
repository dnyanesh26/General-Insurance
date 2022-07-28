package com.lti.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;

@Entity
@Table(name="CLAIMRECORDS")
public class Claim {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="CLAIMIDSEQ")
	@SequenceGenerator(name="CLAIMIDSEQ",sequenceName="claimidseq",allocationSize = 1,initialValue = 101)
	@Column(name="CLAIMID")
	private int claimId;
	
	@Column(name="CLAIMDATE")
	private Date claimDate;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@Column(name="REASON")
	private String reason;

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public Date getDate() {
		return claimDate;
	}

	public void setDate(Date date) {
		this.claimDate = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Claim(int claimId, Date date, String status, double amount, String reason) {
		super();
		this.claimId = claimId;
		this.claimDate = date;
		this.status = status;
		this.amount = amount;
		this.reason = reason;
	}

	public Claim() {
		super();
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", date=" + claimDate + ", status=" + status + ", amount=" + amount
				+ ", reason=" + reason + "]";
	}
	
	

}
