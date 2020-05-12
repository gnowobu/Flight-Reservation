package com.tzy.flightreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tzy.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByemail(String email);
}
