package com.BrownField.pss.Form;


import java.util.Date;



public class SearchForm {

	private String from;
	private String to;
	private String depart;	
	private String trip_type;
	private String ret;
	private String seatingClass;
	private int adults;
	private int child;
	private int infants;
	
	public SearchForm() {	
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTrip_type() {
		return trip_type;
	}
	public void setTrip_type(String trip_type) {
		this.trip_type = trip_type;
	}
	@Override
	public String toString() {
		return "SearchForm [from=" + from + ", to=" + to + ", depart=" + depart + ", trip_type=" + trip_type + ", ret="
				+ ret + ", seatingClass=" + seatingClass + ", adults=" + adults + ", child=" + child + ", infants="
				+ infants + "]";
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDepartureDate() {
		return depart;
	}
	public void setDepartureDate(String departureDate) {
		this.depart = departureDate;
	}
	public String getRetureDate() {
		return ret;
	}
	public void setRetureDate(String retureDate) {
		this.ret = retureDate;
	}
	public String getSeatingClass() {
		return seatingClass;
	}
	public void setSeatingClass(String seatingClass) {
		this.seatingClass = seatingClass;
	}
	public int getNoofAdults() {
		return adults;
	}
	public void setNoofAdults(int noofAdults) {
		this.adults = noofAdults;
	}
	public int getNoofChildrens() {
		return child;
	}
	public void setNoofChildrens(int noofChildrens) {
		this.child = noofChildrens;
	}
	public int getNoofInfants() {
		return infants;
	}
	public void setNoofInfants(int noofInfants) {
		this.infants = noofInfants;
	}
	
	
	
}
