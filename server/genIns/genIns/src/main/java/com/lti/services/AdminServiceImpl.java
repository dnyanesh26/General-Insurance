package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Admin;
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

}
