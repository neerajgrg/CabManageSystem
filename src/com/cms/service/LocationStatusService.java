package com.cms.service;

import com.cms.dao.CabDao;
import com.cms.model.Cab;
import com.cms.model.City;

public class LocationStatusService {
	
	CabDao cabDao;
	
	public LocationStatusService(CabDao cabDao) {
		this.cabDao = cabDao;
	}

	public void updateStatus(Cab cab, City newCity) {
		City currentCity = cab.getCurrentCity();
		cabDao.removeCabFromCityList(cab, currentCity);
		
		cab.setCurrentCity(newCity);
		
		boolean isAdded = cabDao.addCabToCity(newCity, cab);
		if( !isAdded ) {
			System.out.println("Cab is not serviceable in new city");
		} 
	}

}
