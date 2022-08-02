package com.lti.genIns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.lti.beans.Vehicle;
import com.lti.dao.VehicleDao;
import com.lti.services.VehicleService;

@SpringBootTest
public class TestVehicle {
	
	@Test
	void contextLoads() {
	}
	
	@Autowired
	VehicleService service;
	
	
	@MockBean
	VehicleDao vehiclerepo;
	
	@Test
	void testGetVehicles() {
		
		Vehicle v1= new Vehicle("110","Four","kia","sonnet","dl123",100000.00,2,"ch123", null);
		Vehicle v2= new Vehicle("111","Four","kia","sonnet","dl123",100000.00,2,"ch123",null);
		
		List<Vehicle> vehicleList = new ArrayList<>();
		
		
		vehicleList.add(v1);
		vehicleList.add(v2);
		
		System.out.println(vehiclerepo.getVehicle(0));
		System.out.println(vehicleList);
		
		
		Mockito.when(vehiclerepo.getVehicle(0)).thenReturn(vehicleList);
		assertEquals(vehicleList.get(0).getVehRegNo(),"110");
		
	
	}
	
	
}
