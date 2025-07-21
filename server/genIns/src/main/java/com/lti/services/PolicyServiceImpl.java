package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Claim;
import com.lti.beans.Policy;
import com.lti.dao.PolicyDao;


@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyDao dao;
	
	
	@Override
	public void addPolicy(Policy policy) {
		dao.addPolicy(policy);
		
	}


	@Override
	public void deletePolicy(int no) {
		dao.deletePolicy(no);
		
	}


	@Override
	public List<Claim> getClaim(int id) {
		
		return dao.getClaim(id);
	}


	@Override
	public void updatePolicy(Policy p) {
		dao.updatePolicy(p);
		
	}

}
