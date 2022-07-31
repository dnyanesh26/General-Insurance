package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Vehicle;
import com.lti.dao.VehicleDao;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleDao dao;

	@Override
	public String addReg(Vehicle v) {
		// TODO Auto-generated method stub
		System.out.println("service layer");
		return dao.addReg(v);
	}

	@Override
	public List<Vehicle> getVehicle(int id) {
		
		return dao.getVehicle(id);
	}

	@Override
	public Vehicle editVehicle(Vehicle vehicle) {
		
		return dao.editVehicle(vehicle);
	}

}
