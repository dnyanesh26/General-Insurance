package com.lti.services;

import java.util.LinkedHashMap;
import java.util.List;

import org.omg.CORBA.UserException;

import com.lti.beans.User;



@SuppressWarnings("unused")
public interface UserService {
	
	public String addUser(User user) throws UserException;

	public User getUser(String email) throws UserException;

	public User updateUser(User user);

	public String deleteUser(int id);
	
	

}
