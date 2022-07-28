package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Vehicle;
import com.lti.services.VehicleService;



@RestController
@RequestMapping("/vehicle-api")
public class VehicleController {
	
	@Autowired
	VehicleService service;
	//   http://localhost:8090/vehicle-api/addVehicle
	//   http://localhost:8090/vehicle-api/addVehicle
	@PostMapping("/addVehicle")
	public String addReg(@RequestBody Vehicle v)
	{
		System.out.println("controller" +v);
		service.addReg(v);
		return "Record for"+service.addReg(v)+"added.";
	}
	
	
	
	

}
