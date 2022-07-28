package com.lti.services;

import com.lti.beans.Claim;
import com.lti.exceptions.ClaimExcep;

public interface ClaimService {
	
	public String addClaim(Claim claim) throws ClaimExcep;

}
