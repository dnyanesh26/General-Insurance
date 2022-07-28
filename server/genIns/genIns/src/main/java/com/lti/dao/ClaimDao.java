package com.lti.dao;

import com.lti.beans.Claim;
import com.lti.exceptions.ClaimExcep;

public interface ClaimDao {
	
	public String addClaim (Claim claim) throws ClaimExcep;

}
