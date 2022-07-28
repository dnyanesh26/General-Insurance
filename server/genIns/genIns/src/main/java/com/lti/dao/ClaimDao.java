package com.lti.dao;

import com.lti.beans.Claim;
import com.lti.beans.User;
import com.lti.exceptions.ClaimExcep;

public interface ClaimDao {
	
	public String addClaim (Claim claim) throws ClaimExcep;
	
	public Claim updateClaim(Claim claim);
	
	public String deleteClaim(int id);

}
