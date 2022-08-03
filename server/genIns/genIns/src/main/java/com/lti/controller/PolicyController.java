package com.lti.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Claim;
import com.lti.beans.Policy;
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
	public String deletePolicy(@RequestHeader  LinkedHashMap p)
	{	System.out.println(p);
	
		int No =Integer.parseInt((String)p.get("policyno"));
		System.out.println(No);
		service.deletePolicy(No);
		return "deleted";
	}

	@PostMapping("/claim")
	public List<Claim> getClaim(@RequestBody LinkedHashMap u)
	{
		
		int Id=Integer.parseInt((String)u.get("Id"));
		return service.getClaim(Id);
	}
	
	@PutMapping("/updatePolicy")
	public String updatePolicy(@RequestBody Policy p)
	{
		service.updatePolicy(p);
		return ("Policy renewed");
	}
}
