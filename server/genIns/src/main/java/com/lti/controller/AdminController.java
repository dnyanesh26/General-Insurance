package com.lti.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.beans.Claim;
import com.lti.beans.Policy;
import com.lti.beans.Ticket;
import com.lti.beans.Vehicle;
import com.lti.exceptions.AdminException;
import com.lti.services.AdminService;



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
	
	@PutMapping("/appClaim")
	public Claim appClaim(@RequestBody Claim c)
	{
		return(service.appClaim(c));
	}
	
	@GetMapping("/claim")
	public List<Claim> getClaimList()
	{
		return(service.getClaimList());
	}
	
	@GetMapping("/ticket")
	public List<Ticket> getTicketList()
	{
		return(service.getTicketList());
	}
	
	@GetMapping("/vehicle")
	public List<Vehicle> getVechList()
	{
		return(service.getVechList());
	}
	
	@GetMapping("/policy")
	public List<Policy> getPolicyList()
	{
		return(service.getPolicyList());
	}

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
