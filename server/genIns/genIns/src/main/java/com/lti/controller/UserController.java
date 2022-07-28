package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.beans.User;
import com.lti.services.UserService;



@SuppressWarnings("unused")
@RestController
@CrossOrigin("*")
@RequestMapping("/user-api")

public class UserController {
	
	
	UserService service;
	
	
	
//	@GetMapping("/getEmpbyId/{eid}")
//	public Employee getEmpbyId(@PathVariable("eid") int userId)
//	{
//		Employee e=service.getEmpbyId(userId);
//		return e;
//	}
//	
//	
//	@GetMapping("/employee")
//	public List<Employee> getEmpList()
//	{
//		return(service.getEmpList());
//	}
//	
	@PostMapping(path="/addUser")
	public String addEmp(@RequestBody User user)
	{	
		return ("Record for"+service.addUser(user)+"added.");
	}
//
//	@PutMapping("/editSal")
//	public Employee editSal(@RequestBody Employee e)
//	
//	{
//		
//		return (service.editSal(e.getEmpNo(),e.getEmpSal()));
//	}
//	
//	@PostMapping("/addempdept/{did}")
//	public int addEmpDept(@PathVariable("did") int Id,@RequestBody Employee e)
//	{
//		Department d = deptservice.getDeptbyId(Id);
//		e.setDepartment(d);
//		
//		return(service.addEmployee(e));
//		
//	}
//	@PostMapping("/addempdept")
//	public int addEmpDept(@RequestBody Employee e)
//	{
//		
//		
//		return(service.addEmployee(e));
//		
//	}
	
	
}