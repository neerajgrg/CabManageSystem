package com.cms.model;

public class Booking {
	
	private int cabID;
	private int userID;
	private int bookingId;
	private int cabId;
	private int billingAmount;
	
	public Booking(int cabID, int userID) {
		this.cabId = cabID;
		this.userID = userID;
	}
	
	public  int getBookingId() {
		return bookingId;
	}

	public int getCabID() {
		return cabID;
	}

	public void setCabID(int cabID) {
		this.cabID = cabID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCabId() {
		return cabId;
	}


	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public int getBillingAmount() {
		return billingAmount;
	}


	public void setBillingAmount(int billingAmount) {
		this.billingAmount = billingAmount;
	}


}
