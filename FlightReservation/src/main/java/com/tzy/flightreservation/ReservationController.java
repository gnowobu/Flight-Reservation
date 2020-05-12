package com.tzy.flightreservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tzy.flightreservation.dto.ReservationRequest;
import com.tzy.flightreservation.entities.Flight;
import com.tzy.flightreservation.entities.Reservation;
import com.tzy.flightreservation.repositories.FlightRepository;
import com.tzy.flightreservation.service.ReservationService;
import com.tzy.flightreservation.service.ReservationServiceImp;

@Controller

public class ReservationController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/showCompleteDetail")
	public String showReservationDetail(@RequestParam("flightid")Long id, ModelMap modelMap) {
		
		Flight flight = flightRepository.findById(id).get();
		modelMap.addAttribute("flight", flight);
		return "reservationDetail";
	}
	
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		
		//ReservationService rservice = new ReservationServiceImp();
		Reservation reservation = reservationService.bookflight(request);
		
		modelMap.addAttribute("msg", "Successed! The reservation id is: " + reservation.getId());
		return "reservationConfirmation";

	}
	}
