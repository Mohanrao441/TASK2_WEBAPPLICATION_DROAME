package com.Droame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Droame.entity.Booking_Details;
import com.Droame.service.Booking_Service;

@RestController
@RequestMapping("/Bookingspage")
public class Booking_Controller {

	@Autowired
	private Booking_Service booking_Service;

	private Booking_Details booking_Details;

	@PostMapping("/NewBooking")
	public String NewBooking(@RequestBody Booking_Details booking_Details) {
		System.err.println("New Booking Added Sucessfully!!");
		return "New Booking Added Sucessfully!!";
		
		
	}

	@GetMapping("/GetAllBookings")
	public List<Booking_Details> listofAllBookings( @RequestBody Booking_Details booking_Details) {
		System.err.println("Fetched All Bookings Sucessfullly");
		return booking_Service.GetAllBookings(booking_Details);
	}

	@PutMapping("/UpdateBookingDetails/{Booking_id}")
	public Booking_Details UpdateCustomerDetailsById(@PathVariable int Booking_id) {
		Booking_Details updates = booking_Service.UpdateBookingById(Booking_id);
		System.err.println("Update Record SucessFully");
		return updates;
	}

	@DeleteMapping("/DeleteBookingDetails/{Booking_id}")
	public void DeleteCustomerDetailsById(@PathVariable int Booking_id) {
		booking_Service.DeleteBookingById(Booking_id);
		System.err.println("Delete  Record SucessFully");

	}

}
