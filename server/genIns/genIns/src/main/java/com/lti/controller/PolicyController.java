package com.lti.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Claim;
import com.lti.beans.Policy;
import com.lti.beans.Ticket;
import com.lti.services.PolicyService;


@SuppressWarnings("unused")
@RestController
@CrossOrigin("*")
@RequestMapping("/policy-api")
public class PolicyController {
	
	@Autowired
	PolicyService service;
	
	@PostMapping(path="/addPolicy")
	public String addPolicy(@RequestBody Policy policy)
	{	
		service.addPolicy(policy);
		return("Policy added");
	}
	
	@DeleteMapping("/deletePolicy")
	public String deletePolicy(@RequestBody  LinkedHashMap p)
	{
		int No =(Integer)p.get("policyNo"); 
		System.out.println(No);
		service.deletePolicy(No);
		return ("deleted");
	}

	@GetMapping("/claim")
	public List<Claim> getClaim(@RequestBody LinkedHashMap u)
	{
		int Id=(Integer)u.get("Id");
		return service.getClaim(Id);
	}
}
