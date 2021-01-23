package com.cms.dao;

import java.util.Set;

import com.cms.model.Cab;
import com.cms.model.City;

public class RegisterationDao {
	
	CarDB carDB;
	
	public RegisterationDao(CarDB carDB) {
		this.carDB = carDB;
	}

	public boolean isServiceableCity(City city) {
		Set<City> st = carDB.getServiceableCities();
		return st.contains(city);
	}

	public void registerCab(Cab cab, City city) {
		carDB.addCarToCity(city, cab);
	}

}
