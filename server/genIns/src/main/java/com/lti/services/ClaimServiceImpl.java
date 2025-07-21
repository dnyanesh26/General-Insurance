package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Claim;
import com.lti.beans.User;
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
	
	@Override
	public Claim updateClaim(Claim claim) {
		
		return dao.updateClaim(claim);
	}
	
	@Override
	public String deleteClaim(int id) {
		
		return dao.deleteClaim(id);
	}

	@Override
	public List<Claim> getClaimbyId(int id) {
		
		return dao.getClaimbyId(id);
	}

}
