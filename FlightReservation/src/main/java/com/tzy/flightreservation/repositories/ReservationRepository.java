package com.tzy.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tzy.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
