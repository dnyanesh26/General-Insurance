package com.lti.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="POLICYNO")
	private Policy policy;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USERID")
	private User user;

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claim(int claimId, Date claimDate, String status, double amount, String reason, Policy policy, User user) {
		super();
		this.claimId = claimId;
		this.claimDate = claimDate;
		this.status = status;
		this.amount = amount;
		this.reason = reason;
		this.policy = policy;
		this.user = user;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public Date getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
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

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", claimDate=" + claimDate + ", status=" + status + ", amount=" + amount
				+ ", reason=" + reason + ", policy=" + policy + ", user=" + user + "]";
	}

	
	
	
	
	

}
