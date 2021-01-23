package com.cms.main;

import com.cms.dao.BookingDao;
import com.cms.dao.CmsDB;
import com.cms.dao.CabDao;
import com.cms.dao.RegisterationDao;
import com.cms.model.Cab;
import com.cms.model.City;
import com.cms.model.User;
import com.cms.service.BookingService;
import com.cms.service.LocationStatusService;
import com.cms.service.RegisterationService;

public class CmsMain {
	
     public static void main(String[] args) throws Exception {
		
    	 CmsDB cmsDB = new CmsDB();
    	 CabDao cabDao = new CabDao(cmsDB);
    	
    	 City city = new City(1, "delhi");
    	 Cab cab = new Cab(1, "ABC", city);
    	 RegisterationDao registerationDao = new RegisterationDao(cmsDB);
    	 RegisterationService registerationService  = new RegisterationService(registerationDao, cabDao);
    	 registerationService.registerCab(cab);
    	 
    	 LocationStatusService locationStatusService = new LocationStatusService(cabDao);
    	 City cityToChange = new City(2, "Mumbai");
    	 locationStatusService.updateStatus(cab, cityToChange);
    	 
    	 User user = new User();
    	 BookingDao bookingDao = new BookingDao(cmsDB);
    	 BookingService bookingService = new BookingService(bookingDao, cabDao);
    	 City bookingCity = new City(1, "delhi");
    	 
    	 int bookingID =  bookingService.bookCab(user, bookingCity);
    	 
    	 if(bookingID == -1) {
    		 System.out.println("Booking UnSuccessFull");
    	 } else {
    		 System.out.println("Booking ID: " + bookingID);
    	 }
    	
	}
}
