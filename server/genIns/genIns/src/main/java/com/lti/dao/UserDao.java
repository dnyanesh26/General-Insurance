package com.lti.dao;



import com.lti.beans.User;
import com.lti.exceptions.UserException;

public interface UserDao {
	
	public String addUser (User user) throws UserException; 

	public User getUser(String email) throws UserException;

	public User updateUser(User user);

	public String deleteUser(int id);

}
