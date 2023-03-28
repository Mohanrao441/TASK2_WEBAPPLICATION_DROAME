package com.Droame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Droame.entity.Booking_Details;
import com.Droame.service.repository.Booking_Repository;

@Service
public class Booking_Service {

	@Autowired
	private Booking_Repository booking_Repository;

	private Booking_Details booking_Details;

	public Booking_Details AddBooking(@RequestBody Booking_Details booking_Details) {
		
		return booking_Repository.save(booking_Details);

	}

	public List<Booking_Details> GetAllBookings(@RequestBody Booking_Details booking_Details) {
		return booking_Repository.findAll();

	}

	public Booking_Details UpdateBookingById(@PathVariable int Booking_id) {

		Booking_Details updateById = booking_Repository.findById(Booking_id).get();

		return booking_Repository.save(updateById);

	}

	public void DeleteBookingById(@PathVariable int Booking_id) {

		Booking_Details deleteById = booking_Repository.findById(Booking_id).get();

		booking_Repository.delete(booking_Details);
	}

}
