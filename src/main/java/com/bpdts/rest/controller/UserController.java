package com.bpdts.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 
import com.bpdts.rest.dao.UserDAO;
import com.bpdts.rest.model.Users;

@RestController
public class UserController {
	
	@Autowired
    private UserDAO userDao;
     
    @GetMapping(path="/city/{city}/users", produces = "application/json")
    public Users getUsersByCity(@PathVariable String city) 
    {
        return userDao.getUsersByCity(city);
    }
    
    @GetMapping(path="/users", produces = "application/json")
    public Users getUsersByLatLon() 
    {
        return userDao.getUsersByLatLon();
    }
}
