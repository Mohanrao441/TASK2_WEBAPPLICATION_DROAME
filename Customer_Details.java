package com.Droame.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Customer_id;
	private String Customer_Name;
	private String Customer_Email;
	private Long Customer_PhoneNumber;

	public int getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}

	public String getCustomer_Name() {
		return Customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}

	public String getCustomer_Email() {
		return Customer_Email;
	}

	public void setCustomer_Email(String customer_Email) {
		Customer_Email = customer_Email;
	}

	public Long getCustomer_PhoneNumber() {
		return Customer_PhoneNumber;
	}

	public void setCustomer_PhoneNumber(Long customer_PhoneNumber) {
		Customer_PhoneNumber = customer_PhoneNumber;
	}
	
	
	@OneToMany(mappedBy = "customer_Details")
	private Set<Booking_Details> booking_Details;

	public Customer_Details() {
		super();

	}

	public Customer_Details(int customer_id, String customer_Name, String customer_Email, Long customer_PhoneNumber) {
		super();
		this.Customer_id = customer_id;
		this.Customer_Name = customer_Name;
		this.Customer_Email = customer_Email;
		this.Customer_PhoneNumber = customer_PhoneNumber;
	}

	@Override
	public String toString() {
		return "Customer_Details [Customer_id=" + Customer_id + ", Customer_Name=" + Customer_Name + ", Customer_Email="
				+ Customer_Email + ", Customer_PhoneNumber=" + Customer_PhoneNumber + "]";
	}
	

	
	
}
