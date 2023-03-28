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

import com.Droame.entity.Customer_Details;
import com.Droame.service.Customer_Service;


@RestController
@RequestMapping("/Customerpage")
public class Customer_Controller {

	@Autowired
	private Customer_Service customer_Service;

	private Customer_Details customer_Details;

	@PostMapping("/CreateCustomerRecord")
	public Customer_Details CreateCustomerData(@RequestBody Customer_Details customer_Details) {
		return customer_Service.CreateBooking(customer_Details);
	}

	@GetMapping("/GetAllCustomerDetails")
	public List<Customer_Details> GetAllData(@RequestBody Customer_Details customer_Details) {
		return customer_Service.GetAllCustomer_Details(customer_Details);
	}

	@PutMapping("/UpdateCustomerDetails/{Booking_id}")
	public Customer_Details UpdateCustomerDetailsById(@PathVariable int Booking_id) {
		Customer_Details updates = customer_Service.UpdateCustomer_DetailsById(Booking_id);

		return updates;
	}

	@DeleteMapping("/DeleteCustomerDetails/{Booking_id}")
	public void DeleteCustomerDetailsById(@PathVariable int Booking_id) {
		customer_Service.DeleteCustomer_DetailsByid(Booking_id);

	}

}
