package com.lti.dao;

import com.lti.beans.Admin;

public interface AdminDao {

	Admin addAdmin(Admin admin);

	Admin getAdmin(String email);

}
