package com.cms.dao;

import java.util.PriorityQueue;
import java.util.Set;

import com.cms.model.Cab;
import com.cms.model.City;

public class CabDao {

	CmsDB cmsDB;
	
	public CabDao(CmsDB cabDB) {
		this.cmsDB = cabDB;
	}

	public boolean isServiceableCity(City city) {
		Set<City> st = cmsDB.getServiceableCities();
		return st.contains(city);
	}
	
	public boolean addCabToCity(City city, Cab cab) {
		return cmsDB.addCabToCity(city, cab);
	}
	
	public void removeCabFromCityList(Cab cab, City city) {
		cmsDB.removeCabFromCityList(cab, city);
	}
	
	public PriorityQueue<Cab> getCabsInCity(City bookingCity) {
		return cmsDB.getCabList(bookingCity);
	}

}
