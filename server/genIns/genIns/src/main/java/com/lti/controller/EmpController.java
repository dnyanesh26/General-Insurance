package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.lti.beans.Department;
import com.lti.beans.Employee;
import com.lti.services.DeptService;
import com.lti.services.EmpService;


@RestController
@CrossOrigin("*")
@RequestMapping("/emp-api")

public class EmpController {
	
	@Autowired
	EmpService service;
	
	@Autowired
	DeptService deptservice;
	
	@GetMapping("/getEmpbyId/{eid}")
	public Employee getEmpbyId(@PathVariable("eid") int userId)
	{
		Employee e=service.getEmpbyId(userId);
		return e;
	}
	
	
	@GetMapping("/employee")
	public List<Employee> getEmpList()
	{
		return(service.getEmpList());
	}
	
	@PostMapping(path="/addEmp",produces="application/json")
	public String addEmp(@RequestBody Employee e)
	{
		
		System.out.println(e);
	

	
		return ("Record for Employee Id "+service.addEmployee(e)+" added.");
		
	}

	@PutMapping("/editSal")
	public Employee editSal(@RequestBody Employee e)
	
	{
		
		return (service.editSal(e.getEmpNo(),e.getEmpSal()));
	}
	
	@PostMapping("/addempdept/{did}")
	public int addEmpDept(@PathVariable("did") int Id,@RequestBody Employee e)
	{
		Department d = deptservice.getDeptbyId(Id);
		e.setDepartment(d);
		
		return(service.addEmployee(e));
		
	}
	@PostMapping("/addempdept")
	public int addEmpDept(@RequestBody Employee e)
	{
		
		
		return(service.addEmployee(e));
		
	}
	
	
}

