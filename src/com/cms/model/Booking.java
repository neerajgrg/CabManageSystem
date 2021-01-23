package com.cms.model;

public class Booking {
	
	private Cab cab;
	private User user;
	private static int bookingId;
	private int cabId;
	private int customerId;
	private int billingAmount;
	
	
	
	public static int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		Booking.bookingId = bookingId;
	}

	public int getCabId() {
		return cabId;
	}


	public void setCabId(int cabId) {
		this.cabId = cabId;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getBillingAmount() {
		return billingAmount;
	}


	public void setBillingAmount(int billingAmount) {
		this.billingAmount = billingAmount;
	}


}
