package com.lti.services;

import java.util.List;

import com.lti.beans.Claim;
import com.lti.beans.User;
import com.lti.exceptions.ClaimExcep;

public interface ClaimService {
	
	public String addClaim(Claim claim) throws ClaimExcep;
	
	public Claim updateClaim(Claim claim);

	public String deleteClaim(int id);

	public List<Claim> getClaimbyId(int id);
}
