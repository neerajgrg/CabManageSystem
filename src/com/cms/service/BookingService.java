package com.cms.service;

import java.util.PriorityQueue;

import com.cms.dao.BookingDao;
import com.cms.dao.CabDao;
import com.cms.enums.CabStatus;
import com.cms.model.Booking;
import com.cms.model.Cab;
import com.cms.model.City;
import com.cms.model.User;

public class BookingService {

	BookingDao bookingDao;
	CabDao cabDao;

	public BookingService(BookingDao bookingDao, CabDao cabDao) {
		this.bookingDao = bookingDao;
		this.cabDao = cabDao;
	}

	public int bookCab(User user, City bookingCity) {
		if(cabDao.isServiceableCity(bookingCity)) { 
			PriorityQueue<Cab> pq = cabDao.getCabsInCity(bookingCity);

			if( pq.peek().getCurrentStatus() == CabStatus.IDLE) { 
				Cab cab = pq.poll();
				cab.changeStatus(CabStatus.ON_TRIP);
				pq.add(cab);
				Booking booking = new Booking(cab.getCabId(), user.getId());
				bookingDao.addBooking(booking);
				
				return booking.getBookingId();
			}
		}
		// No car cab be booked
		return -1;
	}

}
