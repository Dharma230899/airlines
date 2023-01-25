package com.BrownField.pss.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BrownField.pss.service.SearchService;
import com.BrownField.pss.vo.Fare;
import com.BrownField.pss.vo.Flight;
import com.BrownField.pss.vo.Inventory;

@Service
public class SearchSerivceImpl implements SearchService{

	@Override
	public List<Flight> getAllFlights() {
		
		
		return getFlightsList();
	}
	
	private List<Flight> getFlightsList(){
		List<Flight> flightsList= new ArrayList<Flight>();
		Flight flight1= new Flight();
		flight1.setArrivalDate("2023-01-25");
		flight1.setArrivalTime("00:30:00");
		flight1.setDepartureDate("2023-01-24");
		flight1.setDepartureTime("21:00:00");
		flight1.setDestination("Delhi");
		flight1.setFlightId(12);
		flight1.setFlightName("6e MN65");
		flight1.setOrigin("Mumbai");
		
		Fare fare1= new Fare();
		fare1.setId(1);
		fare1.setFarePrice(5666);
		
		Inventory invent1= new Inventory();
		invent1.setId(1);
		invent1.setAvailableSeats(23);
		
		flight1.setFare(fare1);
		flight1.setInventory(invent1);
		
//		flightsList.add(flight1);
		return flightsList;
		
		
	}

}
