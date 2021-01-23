package com.cms.main;

import com.cms.dao.BookingDao;
import com.cms.dao.CarDB;
import com.cms.dao.RegisterationDao;
import com.cms.model.Cab;
import com.cms.model.City;
import com.cms.model.User;
import com.cms.service.BookingService;
import com.cms.service.RegisterationService;

public class CmsMain {
     public static void main(String[] args) throws Exception {
		
    	 // Functionalities
    	 City city = new City(1, "delhi");
    	 Cab cab = new Cab(1, "ABC", city);
    	 
    	 User user = new User();
    	 CarDB carDB = new CarDB();
    	 
    	 BookingDao bookingDao = new BookingDao(carDB);
    	 BookingService bookingService = new BookingService(bookingDao);
    	 
    	 RegisterationDao registerationDao = new RegisterationDao(carDB);
    	 RegisterationService registerationService  = new RegisterationService(registerationDao);
    	 
    	 registerationService.registerCab(cab);
    	 
    	 City  bookingCity = new City(1, "delhi");
    	 
    	 bookingService.bookCab(user, bookingCity);
    	
	}
}
