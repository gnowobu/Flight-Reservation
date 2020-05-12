package com.tzy.flightreservation.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation extends BaseEntity {

	@Column(name="CHECKED_IN")
	private boolean checkIn;
	
	@Column(name="NUMBER_OF_BAGS")
	private int numPacakge;
	
	@JoinColumn(name="PASSENGER_ID")
	@OneToOne
	private Passenger passenger;
	
	@JoinColumn(name="FLIGHT_ID")
	@OneToOne
	private Flight flight;
	
	@Column(name="CREATED")
	private Timestamp createdTime;

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public int getNumPacakge() {
		return numPacakge;
	}

	public void setNumPacakge(int numPacakge) {
		this.numPacakge = numPacakge;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}
	
}
