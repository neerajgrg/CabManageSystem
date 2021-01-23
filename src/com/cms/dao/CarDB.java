package com.cms.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import com.cms.model.Cab;
import com.cms.model.City;

public class CarDB {
	
	private Map<City,PriorityQueue<Cab>> map;
	
	public CarDB() {
		map = new HashMap<City,PriorityQueue<Cab>>();
	}
	
	public void addNewCity(City city) {
	      map.put(city, new PriorityQueue<Cab>());
	}
    
	public boolean addCarToCity(City city, Cab cab) {
		  if(!map.containsKey(city)) return false;
		  
	      map.get(city).add(cab);
	      return true;
	}
	
	public PriorityQueue<Cab> getCabList(City city) {
		return map.get(city);
	}
	
	public void updateCabLocation(Cab cab, City newCity) {
		City currentCity =  cab.getCurrentCity();
		map.get(currentCity).remove(cab);
		map.get(newCity).add(cab);
	}

	public Set<City> getServiceableCities() {
		return map.keySet();
	}

}
