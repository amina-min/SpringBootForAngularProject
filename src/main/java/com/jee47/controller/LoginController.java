package com.jee47.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jee47.model.Employee;
import com.jee47.model.UserModel;
import com.jee47.service.UserService;



@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class LoginController {
	

	@Autowired
	private UserService userService;
	SessionFactory sessionFactory;
	
	
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@PostMapping("/login")
    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody UserModel user) {
        List<UserModel> users = (List<UserModel>) userService.findAll();
        Map<String, Object> map = new HashMap<String, Object>();
        
        for (UserModel other : users) {
            if (other.getEmail().equals(user.getEmail()) &&  other.getPassword().equals(user.getPassword())) {
            	map.put("message", "Login Successful");
            	  map.put("status", "Success");
            	  map.put("data", other);
            	  return ResponseEntity.ok(map);
            	
            }
        }

        map.put("message", "Login fail!");
        map.put("status", "Failed");
        map.put("data", null);
        return ResponseEntity.status(412).body(map);
    }
    

	
	
}

	
	
	
	

