package com.lti.services;

import java.util.LinkedHashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.User;
import com.lti.dao.UserDao;
import com.lti.exceptions.UserException;

@Service("EmpService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public String addUser(User user) throws UserException {
		
		
		return dao.addUser(user);
	}

	@Override
	public User getUser(String email) throws UserException {
		
		return dao.getUser(email);
	}

	@Override
	public User updateUser(User user) {
		
		return dao.updateUser(user);
	}

	@Override
	public String deleteUser(int id) {
		
		return dao.deleteUser(id);
	}

}
