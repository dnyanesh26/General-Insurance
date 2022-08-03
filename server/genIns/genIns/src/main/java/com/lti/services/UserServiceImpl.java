package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Policy;
import com.lti.beans.User;
import com.lti.dao.UserDao;
import com.lti.exceptions.UserException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public String addUser(User user) throws UserException{
		
		
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

	@Override
	public List<Policy> getPolicy(int id) {
		
		return dao.getPolicy(id);
	}

}
