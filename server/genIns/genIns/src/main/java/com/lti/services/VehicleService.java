package com.lti.services;

import java.util.List;

import com.lti.beans.Vehicle;

public interface VehicleService {
	
	public String addReg(Vehicle v);

	public List<Vehicle> getVehicle(int id);

	public Vehicle editVehicle(Vehicle vehicle);

}
