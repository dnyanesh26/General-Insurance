package com.lti.services;

import java.util.List;

import com.lti.beans.Claim;
import com.lti.beans.Policy;

public interface PolicyService {

	void addPolicy(Policy policy);

	void deletePolicy(int no);

	List<Claim> getClaim(int id);

	void updatePolicy(Policy p);

}
