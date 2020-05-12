package com.tzy.flightreservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tzy.flightreservation.entities.Reservation;
import com.tzy.flightreservation.repositories.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
	ReservationRepository repo;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		return repo.findById(id).get();
	}
}
