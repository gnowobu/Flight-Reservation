package com.tzy.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tzy.flightreservation.dto.ReservationRequest;
import com.tzy.flightreservation.entities.Flight;
import com.tzy.flightreservation.entities.Passenger;
import com.tzy.flightreservation.entities.Reservation;
import com.tzy.flightreservation.repositories.FlightRepository;
import com.tzy.flightreservation.repositories.PassengerRepository;
import com.tzy.flightreservation.repositories.ReservationRepository;

@Service
public class ReservationServiceImp implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public Reservation bookflight(ReservationRequest request) {
		
		Long id = request.getFlightId();
		
		Flight flight = flightRepository.findById(id).get();
		
		Passenger passenger = new Passenger();
		
		passenger.setFirstname(request.getFirstName());
		passenger.setLastname(request.getLastName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhoneNumber());
		Passenger savedpassenger = passengerRepository.save(passenger);

		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedpassenger);
		reservation.setCheckIn(false);
		
		Reservation saved_res = reservationRepository.save(reservation);
		
		
		return saved_res;
		
	}
	
	
}
