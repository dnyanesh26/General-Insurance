package com.lti.services;

import java.util.List;

import com.lti.beans.Department;

public interface DeptService {

	Department addDept(Department d);

	Department getDeptbyId(int id);

	List getDeptlist();

	void deleteDept(Department d);

}
