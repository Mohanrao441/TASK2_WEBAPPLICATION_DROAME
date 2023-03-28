package com.Droame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.Droame.entity.Customer_Details;
import com.Droame.service.repository.Customer_Repository;

@Service
public class Customer_Service {

	@Autowired
	private Customer_Repository customer_Repository;

	private Customer_Details customer_Details;

	public Customer_Details CreateBooking(@RequestBody Customer_Details customer_Details) {
		return customer_Repository.save(customer_Details);
	}

	public List<Customer_Details> GetAllCustomer_Details(@RequestBody Customer_Details customer_Details) {
		return customer_Repository.findAll();

	}

	public Customer_Details UpdateCustomer_DetailsById(int Customer_id) {
		Customer_Details updateById = customer_Repository.findById(Customer_id).get();

		return customer_Repository.save(customer_Details);
	}

	public void DeleteCustomer_DetailsByid(int Customer_id) {
		Customer_Details deleteById = customer_Repository.findById(Customer_id).get();
		customer_Repository.delete(customer_Details);
	}

}
