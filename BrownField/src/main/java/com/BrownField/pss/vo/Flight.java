package com.BrownField.pss.vo;

import java.sql.Date;

public class Flight {

	private int flightId;
	private String flightName;
	private String origin;
	private String destination;
	private String arrivalDate;
	private String departureDate;
	private String departureTime;
	private String arrivalTime;
	private Inventory inventory;
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	private Fare fare;
	
	
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", origin=" + origin + ", destination="
				+ destination + ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", inventory=" + inventory + ", fare=" + fare + "]";
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	public String getArrivalDate() {
		return arrivalDate;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
}
