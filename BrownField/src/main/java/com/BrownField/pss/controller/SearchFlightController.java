package com.BrownField.pss.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BrownField.pss.serviceimpl.SearchSerivceImpl;
import com.BrownField.pss.vo.Flight;
import com.BrownField.pss.vo.SearchForm;


@Controller
public class SearchFlightController {

	
	@RequestMapping(value="/Search", method=RequestMethod.GET)
	public String getSearchPage( Model model) {
		//model.addAttribute("searchForm", new SearchForm());
		
		SearchForm searchForm = new SearchForm();
		searchForm.setTrip_type("one way");
		model.addAttribute("searchForm",searchForm);
		System.out.println(searchForm);
	
		List<Integer> listNo = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        model.addAttribute("list", listNo);
		List<Integer> listProfession = Arrays.asList(1,2,3,4,5,6,7,8,9);
        model.addAttribute("listAdults", listProfession);
        
		return "Search";
	}
	
	@RequestMapping(value="/getFlights", method=RequestMethod.POST)
	public String getFlights(@ModelAttribute(name="Flight") Flight flight,Model model) {
		
		SearchSerivceImpl search = new SearchSerivceImpl();
		List<Flight> flights =new ArrayList<Flight>();
		flights= search.getAllFlights();
		model.addAttribute("flights",flights);
		return "SelectDepFlights";
	}
	
	
	
	
}
