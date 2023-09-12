package com.trekappAPI.entity;


import java.util.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;

@Entity
@Table(name="bookings")
public class Bookings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;
	
	@Temporal(TemporalType.DATE)
	private Date Booking_date;
	
	@PrePersist
	private void onCreeate() {
		Booking_date = new Date();
	}
	
	@ManyToOne
	@JoinColumn(name="cid", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="tid", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Treks trek;	

	public Date getDate() {
		return Booking_date;
	}


	public void setDate(Date date) {
		this.Booking_date = date;
	}


	public Long getBid() {
		return bid;
	}


	public void setBid(Long bid) {
		this.bid = bid;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Treks getTrek() {
		return trek;
	}


	public void setTrek(Treks trek) {
		this.trek = trek;
	}
}
