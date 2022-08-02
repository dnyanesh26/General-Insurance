package com.lti.genIns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.beans.Admin;
import com.lti.beans.Ticket;
import com.lti.services.TicketService;
import com.lti.services.VehicleService;

@SpringBootTest
public class TestTicket {
	
	@Autowired
	TicketService service;
	
	@Test
	void testGetTicket() {
		Ticket t1= new Ticket("11023","Jaipur","Agra",null,"Train",6,null);
		
		List<Ticket> TicketList=new ArrayList<>();
		TicketList.add(t1);
		
		assertEquals(TicketList.get(0).getTicketNo(),"2");
		
	}

}
