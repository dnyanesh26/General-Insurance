package com.lti.dao;

import org.omg.CORBA.UserException;

import com.lti.beans.User;

public interface UserDao {
	
	public String addUser (User user) throws UserException;

	public User getUser(String email) throws UserException;

	public User updateUser(User user);

	public String deleteUser(int id);

}
