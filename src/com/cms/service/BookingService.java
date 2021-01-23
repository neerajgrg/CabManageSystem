package com.cms.service;

import java.util.List;
import java.util.PriorityQueue;

import com.cms.dao.BookingDao;
import com.cms.enums.CabStatus;
import com.cms.model.Booking;
import com.cms.model.Cab;
import com.cms.model.City;
import com.cms.model.User;

public class BookingService {
	
	BookingDao bookingDao;

	public BookingService(BookingDao bookingDao) {
		this.bookingDao = bookingDao;
	}

	public Booking bookCab(User user, City bookingCity) {
		// TODO: check serviceable city
		
		PriorityQueue<Cab> pq = bookingDao.getCabsInCity(bookingCity);
		
		if( pq.peek().getCurrentStatus() == CabStatus.IDLE) { 
			Cab cab = pq.poll();
			cab.changeStatus(CabStatus.ON_TRIP);
			Booking booking = new Booking();
			 
			return booking;
		}
		
		return null;
		
	}

}
