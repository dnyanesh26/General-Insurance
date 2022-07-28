package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.User;
import com.lti.dao.UserDao;

@Service("EmpService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public String addUser(User user) {
		
		
		return dao.addUser(user);
	}

}
