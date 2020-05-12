package com.tzy.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tzy.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
