package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Claim;
import com.lti.exceptions.ClaimExcep;
import com.lti.services.ClaimService;

@RestController
@RequestMapping("/claim-api")
public class ClaimController {
	
	@Autowired
	ClaimService service;
	
	@PostMapping(path="/addClaim")
	public String addClaim(@RequestBody Claim claim) throws ClaimExcep
	{	
		
		return("Claim "+service.addClaim(claim)+" added");
	}
	

}
