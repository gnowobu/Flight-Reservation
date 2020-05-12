package com.tzy.flightreservation.service;

import com.tzy.flightreservation.dto.ReservationRequest;
import com.tzy.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookflight(ReservationRequest request); 
}
