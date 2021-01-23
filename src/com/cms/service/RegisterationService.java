package com.cms.service;

import com.cms.dao.CabDao;
import com.cms.dao.RegisterationDao;
import com.cms.model.Cab;

public class RegisterationService {
	
    RegisterationDao registerationDao;
    CabDao cabDao;
    
    public RegisterationService(RegisterationDao registerationDao, CabDao cabDao) {
    	this.registerationDao = registerationDao;
    	this.cabDao = cabDao;
	}
    
	public void registerCab(Cab cab) throws Exception {
		if(cabDao.isServiceableCity(cab.getCurrentCity())) {
			registerationDao.registerCab(cab, cab.getCurrentCity());
		} else { 
			throw new Exception("Not a serviceable City");
		}
	}

}
