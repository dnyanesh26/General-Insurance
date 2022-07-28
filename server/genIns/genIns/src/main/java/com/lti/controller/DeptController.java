package com.lti.controller;


import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.beans.Department;
import com.lti.beans.Employee;
import com.lti.services.DeptService;


@RestController
@CrossOrigin("*")
@RequestMapping("/dept-api")

public class DeptController {
	
	@Autowired
	DeptService service;
	
	@PostMapping(path="/addDept")
	public Department addDept(@RequestBody Department d)
	{
		return(service.addDept(d));
	}
	
	@GetMapping(path="/dept")
	public List<Department> getDeptlist()
	{
		List dept =new ArrayList<Department>();
		dept=service.getDeptlist();
		return(dept);
		
	}
	
	@DeleteMapping(path="/deleteDept")
	public void deleteDept(@RequestBody LinkedHashMap id)
	{
		
		int Id=(Integer)id.get("id");
		Department d=service.getDeptbyId(Id);
		service.deleteDept(d);
	}

}
