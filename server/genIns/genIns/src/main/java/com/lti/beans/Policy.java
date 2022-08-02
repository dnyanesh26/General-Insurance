package com.lti.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="POLICY_PLAN")
public class Policy {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="POLICYSEQ")
	@SequenceGenerator(name="POLICYSEQ",sequenceName="policyseq",allocationSize = 1,initialValue = 1101)
	@Column(name="POLICYNO")
	private int policyNo;
	
	@Column(name="POLICYTYPE")
	private String policyType;
	
	@Column(name="POLICYDATE")
	private Date policyDate;
	
	@Column(name="POLICYEXPIRE")
	private Date policyExpire;
	
	@Column(name="PLANTERM")
	private int planTerm;
	
	@Column(name="PREMIUM")
	private int premium;
	
	@Column(name="PLANTYPE")
	private String planType;
	
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="VEHICLE_REGNO",unique=true)
	private Vehicle vehicle;
	
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="TICKETNO",unique=true)
	private Ticket ticket;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USERID")
	private User user;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="policy")
	private List<Claim> claimList;
	
	public Policy() {
		super();
		
	}
	
	

	public Policy(int policyNo, String policyType, int planTerm, int premium, String planType, Vehicle vehicle,
			User user) {
		super();
		this.policyNo = policyNo;
		this.policyType = policyType;
		this.planTerm = planTerm;
		this.premium = premium;
		this.planType = planType;
		
	}

	


	public Policy(int policyNo, String policyType, int planTerm, int premium, String planType, Ticket ticket,
			Date policyExpire,Date policyDate,User user) {
		super();
		this.policyNo = policyNo;
		this.policyType = policyType;
		this.planTerm = planTerm;
		this.premium = premium;
		this.planType = planType;
		this.policyDate=policyDate;
		this.policyExpire=policyExpire;
		this.ticket = ticket;
		this.user = user;
	}

	
	public Date getPolicyExpire() {
		return policyExpire;
	}

	public void setPolicyExpire(Date policyExpire) {
		this.policyExpire = policyExpire;
	}

	public Date getPolicyDate() {
		return policyDate;
	}

	public void setPolicyDate(Date policyDate) {
		this.policyDate = policyDate;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public int getPlanTerm() {
		return planTerm;
	}

	public void setPlanTerm(int planTerm) {
		this.planTerm = planTerm;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	


	
	

}
