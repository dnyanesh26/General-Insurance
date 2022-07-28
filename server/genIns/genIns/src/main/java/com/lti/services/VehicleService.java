package com.lti.services;

import java.util.List;

import com.lti.beans.Vehicle;

public interface VehicleService {
	
	public int addReg(Vehicle v);

	public List<Vehicle> getVehicle(int id);

}
