package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Admin;
import com.lti.beans.Claim;
import com.lti.beans.Policy;
import com.lti.beans.Ticket;
import com.lti.beans.Vehicle;
import com.lti.dao.AdminDao;
import com.lti.dao.UserDao;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDao dao;
	
	@Override
	public Admin addAdmin(Admin admin) {
		
		return dao.addAdmin(admin);
	}

	@Override
	public Admin getAdmin(String email) {
		
		return dao.getAdmin(email);
	}

	@Override
	public List<Policy> getPolicyList() {
		
		return (dao.getPolicyList());
	}

	@Override
	public List<Vehicle> getVechList() {
		return (dao.getVechList());
	}

	@Override
	public List<Ticket> getTicketList() {
		return (dao.getTicketList());
	}

	@Override
	public List<Claim> getClaimList() {
		return (dao.getClaimList());
	}

	@Override
	public Claim appClaim(Claim c) {
		
		return dao.appClaim(c);
	}

}
