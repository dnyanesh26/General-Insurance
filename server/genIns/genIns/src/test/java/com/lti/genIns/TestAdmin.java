package com.lti.genIns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.beans.Admin;
import com.lti.services.AdminService;

@SpringBootTest
public class TestAdmin {
	
	@Autowired
	AdminService service;
	
	@Test
	void testgetAdmin() {
		
		Admin a1=new Admin(1,"Jay","1234");
		List<Admin> AdminList=new ArrayList<>();
		AdminList.add(a1);
		System.out.println(AdminList);
		assertEquals(AdminList.get(0).getAdminId(),2);
		
	}

}
