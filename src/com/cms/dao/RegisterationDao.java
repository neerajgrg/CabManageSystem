package com.cms.dao;

import com.cms.model.Cab;
import com.cms.model.City;

public class RegisterationDao {
	
	CmsDB cmsDB;
	
	public RegisterationDao(CmsDB carDB) {
		this.cmsDB = carDB;
	}

	public void registerCab(Cab cab, City city) {
		cmsDB.addCabToCity(city, cab);
	}

}
