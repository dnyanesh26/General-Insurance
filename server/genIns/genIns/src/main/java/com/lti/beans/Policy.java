package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="POLICY_PLAN")
public class Policy {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator="POLICYSEQ")
	@SequenceGenerator(name="POLICYSEQ",sequenceName="policyseq",allocationSize = 1,initialValue = 101)
	@Column(name="POLICYNO")
	private int policyNo;
	
	@Column(name="PLANTERM")
	private int planTerm;
	
	@Column(name="PREMIUM")
	private int premium;
	
	@Column(name="PLANTYPE")
	private String planType;

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(int policyNo, int planTerm, int premium, String planType) {
		super();
		this.policyNo = policyNo;
		this.planTerm = planTerm;
		this.premium = premium;
		this.planType = planType;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
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
	
	
	

}
