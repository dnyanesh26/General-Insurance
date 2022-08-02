package com.lti.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.beans.Admin;
import com.lti.beans.User;
import com.lti.exceptions.AdminException;
import com.lti.services.AdminService;


@SuppressWarnings("unused")
@RestController
@CrossOrigin("*")
@RequestMapping("/admin-api")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	
	
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
	@PostMapping(path="/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) throws AdminException
	{	
		
		return(service.addAdmin(admin));
	}
	
	@GetMapping("/admin")
	public @ResponseBody Admin getUser(@RequestHeader LinkedHashMap a) throws AdminException
	{	System.out.println(a);
		String email=(String)a.get("username");
		return service.getAdmin(email);
	}
//	
//	@PutMapping("/updateUser")
//	public @ResponseBody User updateUser(@RequestBody User user)
//	{
//		return service.updateUser(user);
//	}
//	
//	@DeleteMapping("/deleteUser")
//	public String deleteUser(@RequestBody LinkedHashMap u)
//	{
//		int Id=(Integer)u.get("Id");
//		return service.deleteUser(Id);
//	}
	
}
