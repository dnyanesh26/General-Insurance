package com.lti.beans;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TICKETS")
public class Ticket {
@Id	
@Column(name="TICKETNO")	
private int ticketNo;

@Column(name="SOURCE")
private String source;

@Column(name="DESTINATION")
private String destination;

@Column(name="TRAVEL")
private Date travel;

@Column(name="TRAVELMODE")
private String travelmode;

@Column(name="PASSANGER")
private int passanger;

@Column(name="VALIDITY")
private String validity;

@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="USERID")
private User user;



public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}

public Ticket(int ticketNo, String source, String destination, Date travel, String travelmode, int passanger,
		String validity, User user) {
	super();
	this.ticketNo = ticketNo;
	this.source = source;
	this.destination = destination;
	this.travel = travel;
	this.travelmode = travelmode;
	this.passanger = passanger;
	this.validity = validity;
	this.user = user;
}

public int getTicketNo() {
	return ticketNo;
}

public void setTicketNo(int ticketNo) {
	this.ticketNo = ticketNo;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public Date getTravel() {
	return travel;
}

public void setTravel(Date travel) {
	this.travel = travel;
}

public String getMode() {
	return travelmode;
}

public void setMode(String mode) {
	this.travelmode = mode;
}

public int getPassanger() {
	return passanger;
}

public void setPassanger(int passanger) {
	this.passanger = passanger;
}

public String getValidity() {
	return validity;
}

public void setValidity(String validity) {
	this.validity = validity;
}


}
