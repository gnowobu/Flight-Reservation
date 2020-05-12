package com.tzy.flightreservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="FLIGHT")
public class Flight extends BaseEntity {
	
	
	@Column(name="FLIGHT_NUMBER")
	private String flightNumber;
	
	@Column(name="OPERATING_AIRLINES")
	private String operatingAirlines;
	
	@Column(name="ARRIVAL_CITY")
	private String arrivalCity;
	
	@Column(name="DEPARTURE_CITY")
	private String departureCity;
	
	@Column(name="DATE_OF_DEPARTURE")
	private Date dateofDeparture;
	
	@Column(name="ESTIMATED_DEPARTURE_TIME")
	private Timestamp estimatedDeparture;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public Date getDateofDeparture() {
		return dateofDeparture;
	}

	public void setDateofDeparture(Date dateofDeparture) {
		this.dateofDeparture = dateofDeparture;
	}

	public Timestamp getEstimatedDeparture() {
		return estimatedDeparture;
	}

	public void setEstimatedDeparture(Timestamp estimatedDeparture) {
		this.estimatedDeparture = estimatedDeparture;
	}

	

	
	

}
