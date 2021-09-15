package com.lti.model;

public class Booking {
	int bookingId;
	String flight;
	public Booking(int bookingId, String flight) {
		super();
		this.bookingId = bookingId;
		this.flight = flight;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	

}
