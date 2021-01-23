package com.cms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import com.cms.model.Booking;
import com.cms.model.Cab;
import com.cms.model.City;

public class CmsDB {
	
	private Map<City,PriorityQueue<Cab>> map;
	private List<Booking> bookingList;
	
	public CmsDB() {
		map = new HashMap<City,PriorityQueue<Cab>>();
		bookingList = new ArrayList<Booking>();
	}
	
	public List<Booking> getBookingList() {
		return bookingList;
	}

	public void setBookingList(List<Booking> bookingList) {
		this.bookingList = bookingList;
	}

	public void addNewCity(City city) {
	      map.put(city, new PriorityQueue<Cab>());
	}
	
	public PriorityQueue<Cab> getCabList(City city) {
		return map.get(city);
	}

	public Set<City> getServiceableCities() {
		return map.keySet();
	}
	
	public boolean addCabToCity(City city, Cab cab) {
		  if(!map.containsKey(city)) return false;
		  
	      map.get(city).add(cab);
	      return true;
	}
	
	public void removeCabFromCityList(Cab cab, City city) {
		map.get(city).remove(cab);
	}

}
