package com.lti.dao;

import java.util.List;

import com.lti.beans.Department;

public interface DeptDao {

	Department addDept(Department d);

	Department getDeptbyId(int id);

	List getDeptlist();

	void deleteDept(Department d);

}
