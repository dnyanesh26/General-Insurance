package com.lti.services;

import com.lti.beans.Admin;
import com.lti.beans.User;

public interface AdminService {

	public Admin addAdmin(Admin admin);

	public Admin getAdmin(String email);

}
