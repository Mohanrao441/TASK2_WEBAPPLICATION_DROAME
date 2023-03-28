package com.Droame.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Droame.entity.Booking_Details;

public interface Booking_Repository extends JpaRepository<Booking_Details, Integer> {

	Booking_Details save(Optional<Booking_Details> updateByID);

}
