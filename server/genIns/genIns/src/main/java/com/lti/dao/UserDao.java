package com.lti.dao;



import java.util.List;

import com.lti.beans.Policy;
import com.lti.beans.User;
import com.lti.exceptions.UserException;

public interface UserDao {
	
	public String addUser (User user) throws UserException; 

	public User getUser(String email) throws UserException;

	public User updateUser(User user);

	public String deleteUser(int id);

	public List<Policy> getPolicy(int id);

}
