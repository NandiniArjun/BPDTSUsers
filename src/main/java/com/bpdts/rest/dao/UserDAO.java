package com.bpdts.rest.dao;
 
import org.springframework.stereotype.Repository;

import com.bpdts.rest.model.Location;
import com.bpdts.rest.model.User;
import com.bpdts.rest.model.Users;
 
@Repository
public class UserDAO 
{
    private static Users list = new Users();
 
    static
    {
        list.getUsersList().add(new User(135, "Mechelle", "Boam", "mboam3q@thetimes.co.uk", "113.71.242.187", "London", 6.5115909, 1.652983));
        list.getUsersList().add(new User(688, "Tiffi", "Colbertson", "tcolbertsonj3@vimeo.com", "141.49.93.0", "Coventry", 37.13, -84.08));
        list.getUsersList().add(new User(794, "Katee", "Gopsall", "kgopsallm1@cam.ac.uk", "203.138.133.164", "London", 5.7204203, 10.901604));
    }
     
    public Users getUsersByCity(String city) 
    {
    	Users listByCity = new Users();
    	for (User user : list.getUsersList()) {
    		if (user.getCity().equalsIgnoreCase(city)) { listByCity.getUsersList().add(user); }
        }
        return listByCity;    
    }
    
    public Users getUsersByLatLon() 
    {
    	Users listByLatLon = new Users();
    	Location london = new Location(51.509865, -0.118092);
    	for (User user : list.getUsersList()) {
    		Location loc1 = new Location(user.getLatitude(), user.getLongitude());
    		double distance = loc1.distanceTo(london);
    		if(distance <= 50) {
    			listByLatLon.getUsersList().add(user);
    		}

        }
        return listByLatLon;   
    }
}
