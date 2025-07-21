package com.lti.services;

import java.util.List;

import com.lti.beans.*;

public interface AdminService {

	public Admin addAdmin(Admin admin);

	public Admin getAdmin(String email);

	public List<Policy> getPolicyList();

	public List<Vehicle> getVechList();

	public List<Ticket> getTicketList();

	public List<Claim> getClaimList();

	public Claim appClaim(Claim c);

}
