package com.lti.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Policy;
import com.lti.beans.User;
import com.lti.exceptions.UserException;
import com.lti.services.UserService;



@SuppressWarnings("unused")
@RestController
@CrossOrigin("*")
@RequestMapping("/user-api")
public class UserController {
	
	@Autowired
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
	public String addUser(@RequestBody User user) 
	{	System.out.println(user);
		
		try {
			return("User "+service.addUser(user)+" added");
		} catch (UserException e) {
			// TODO Auto-generated catch block
			
			return(e.getMessage());
		}
	}
	
	@PostMapping("/user")
	public @ResponseBody User getUser(@RequestBody LinkedHashMap u) throws UserException
	{
		
		String email=(String)u.get("email");
		System.out.println(email);
		return service.getUser(email);
	}
	
	@PutMapping("/updateUser")
	public @ResponseBody User updateUser(@RequestBody User user)
	{
		return service.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser(@RequestBody LinkedHashMap u)
	{
		int Id=Integer.parseInt((String)u.get("Id"));
		return service.deleteUser(Id);
	}
	
	@PostMapping("/policy")
	public List<Policy> getPolicy(@RequestBody LinkedHashMap u)
	{
		int Id=Integer.parseInt((String)u.get("Id"));
		return service.getPolicy(Id);
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