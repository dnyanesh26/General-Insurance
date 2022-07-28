package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Vehicle;
import com.lti.dao.VehicleDao;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleDao dao;

	@Override
	public int addReg(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.println("service layer");
		return dao.addReg(v);
	}

}
