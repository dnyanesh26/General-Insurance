package com.lti.dao;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.Claim;
import com.lti.beans.Policy;
import com.lti.beans.Ticket;
import com.lti.beans.Vehicle;

public interface AdminDao {

	Admin addAdmin(Admin admin);

	Admin getAdmin(String email);

	List<Policy> getPolicyList();

	List<Vehicle> getVechList();

	List<Ticket> getTicketList();

	List<Claim> getClaimList();

	Claim appClaim(Claim c);

}
