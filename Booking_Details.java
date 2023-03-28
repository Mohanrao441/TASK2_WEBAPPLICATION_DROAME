package com.Droame.entity;

import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

//@JsonInclude(JsonInclude.Include.NON_NULL)  
@Entity
public class Booking_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Booking_id;

	@Temporal(TemporalType.TIME)
	@DateTimeFormat(style = "hh:mm")
	@Nonnull()
	private LocalTime Created_Time;
	private String Drone_shot_name;

	@ManyToOne(fetch = FetchType.LAZY)
	private Customer_Details customer_Details;

	public Customer_Details getCustomerData() {
		return customer_Details;
	}

	public int getBooking_id() { // Getters & Setters Methods
		return Booking_id;
	}

	public void setBooking_id(int booking_id) {
		Booking_id = booking_id;
	}

	public LocalTime getCreated_Time() {
		return Created_Time;
	}

	public void setCreated_Time(LocalTime created_Time) {
		Created_Time = created_Time;
	}

	public String getDrone_shot_name() {
		return Drone_shot_name;
	}

	public void setDrone_shot_name(String drone_shot_name) {
		Drone_shot_name = drone_shot_name;
	}

	public Booking_Details(int booking_id, LocalTime created_Time, String drone_shot_name,
			Customer_Details customer_Details) {
		super();
		Booking_id = booking_id;
		Created_Time = created_Time;
		Drone_shot_name = drone_shot_name;
		this.customer_Details = customer_Details;
	}
	
	

//	public Booking_Details() { // Default Constructor
//		super();
//
//	}
//
//	public Booking_Details(int booking_id, LocalTime created_Time, String drone_shot_name) {
//		super();
//		this.Booking_id = booking_id; // Default Constructor with fields
//		this.Created_Time = created_Time;
//		this.Drone_shot_name = drone_shot_name;
//	}

}
