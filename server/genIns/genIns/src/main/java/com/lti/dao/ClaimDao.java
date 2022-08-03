package com.lti.dao;

import java.util.List;

import com.lti.beans.Claim;
import com.lti.exceptions.ClaimExcep;

public interface ClaimDao {
	
	public String addClaim (Claim claim) throws ClaimExcep;
	
	public Claim updateClaim(Claim claim);
	
	public String deleteClaim(int id);

	public List<Claim> getClaimbyId(int id);

}
