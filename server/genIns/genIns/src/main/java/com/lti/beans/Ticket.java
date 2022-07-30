package com.lti.beans;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TICKETS")
public class Ticket {
@Id	
@Column(name="TICKETNO")	
private String ticketNo;

@Column(name="DEPARTURELOC")
private String departureLoc;

@Column(name="ARRIVALLOC")
private String arrivalLoc;

@Column(name="TRAVELDATE")
private Date travelDate;

@Column(name="TRAVELMODE")
private String travelMode;

@Column(name="TRAVELTIME")
private int travleTime;

@ManyToOne(fetch=FetchType.EAGER)
@JoinColumn(name="USERID")
private User user;

@OneToOne(mappedBy="ticket")
private Policy policy ;



public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}



public Ticket(String ticketNo, String departureLoc, String arrivalLoc, Date travelDate, String travelMode,
		int travleTime, User user) {
	super();
	this.ticketNo = ticketNo;
	this.departureLoc = departureLoc;
	this.arrivalLoc = arrivalLoc;
	this.travelDate = travelDate;
	this.travelMode = travelMode;
	this.travleTime = travleTime;
	this.user = user;
}



public String getTicketNo() {
	return ticketNo;
}



public void setTicketNo(String ticketNo) {
	this.ticketNo = ticketNo;
}



public String getDepartureLoc() {
	return departureLoc;
}



public void setDepartureLoc(String departureLoc) {
	this.departureLoc = departureLoc;
}



public String getArrivalLoc() {
	return arrivalLoc;
}



public void setArrivalLoc(String arrivalLoc) {
	this.arrivalLoc = arrivalLoc;
}



public Date getTravelDate() {
	return travelDate;
}



public void setTravelDate(Date travelDate) {
	this.travelDate = travelDate;
}



public String getTravelMode() {
	return travelMode;
}



public void setTravelMode(String travelMode) {
	this.travelMode = travelMode;
}



public int getTravleTime() {
	return travleTime;
}



public void setTravleTime(int travleTime) {
	this.travleTime = travleTime;
}



public User getUser() {
	return user;
}



public void setUser(User user) {
	this.user = user;
}



@Override
public String toString() {
	return "Ticket [ticketNo=" + ticketNo + ", departureLoc=" + departureLoc + ", arrivalLoc=" + arrivalLoc
			+ ", travelDate=" + travelDate + ", travelMode=" + travelMode + ", travleTime=" + travleTime + ", user="
			+ user + "]";
}






}
