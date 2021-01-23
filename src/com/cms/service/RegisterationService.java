package com.cms.service;

import com.cms.dao.RegisterationDao;
import com.cms.model.Cab;
import com.cms.model.City;

public class RegisterationService {
	
    RegisterationDao registerationDao;
    
    public RegisterationService(RegisterationDao registerationDao) {
    	this.registerationDao = registerationDao;
	}
    
	public void registerCab(Cab cab) throws Exception{
		if(registerationDao.isServiceableCity(cab.getCurrentCity())) {
			registerationDao.registerCab(cab, cab.getCurrentCity());
		} else { 
			throw new Exception("Not a serviceable City");
		}
	}

}
