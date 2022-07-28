package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Claim;
import com.lti.dao.ClaimDao;
import com.lti.exceptions.ClaimExcep;

@Service("ClaimService")
public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	ClaimDao dao;
	
	@Override
	public String addClaim(Claim claim) throws ClaimExcep {
		
		return dao.addClaim(claim);
	}

}
