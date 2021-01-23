package com.cms.dao;

import java.util.PriorityQueue;
import java.util.Set;

import com.cms.model.Cab;
import com.cms.model.City;

public class BookingDao {

	CarDB carDB;
	public BookingDao(CarDB carDB) {
		this.carDB = carDB;
	}
	
	public boolean isServiceableCity(City city) {
		Set<City> st = carDB.getServiceableCities();
		return st.contains(city);
	}

	public PriorityQueue<Cab> getCabsInCity(City bookingCity) {
		return carDB.getCabList(bookingCity);
		
	}

}
