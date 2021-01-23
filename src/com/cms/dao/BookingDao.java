package com.cms.dao;

import com.cms.model.Booking;

public class BookingDao {

	CmsDB cmsDB;
	
	public BookingDao(CmsDB cmsDB) {
		this.cmsDB = cmsDB;
	}
     
	public void addBooking(Booking booking) {
		cmsDB.getBookingList().add(booking);
	}
}
