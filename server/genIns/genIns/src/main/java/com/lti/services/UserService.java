package com.lti.services;

import java.util.LinkedHashMap;

import java.util.List;

import com.lti.beans.Claim;
import com.lti.beans.Policy;
import com.lti.beans.User;
import com.lti.exceptions.UserException;



@SuppressWarnings("unused")
public interface UserService {
	
	public String addUser(User user) throws UserException;

	public User getUser(String email) throws UserException;

	public User updateUser(User user);

	public String deleteUser(int id);

	public List<Policy> getPolicy(int id);
	
	

}
