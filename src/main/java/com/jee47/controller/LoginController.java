package com.jee47.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jee47.model.AdminModel;
import com.jee47.service.AdminService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class LoginController {

	@Autowired
	private AdminService userService;

	@GetMapping("/")
	public String index() {
		return "Hello World";
	}

	@PostMapping("/adminlogin")
	public ResponseEntity<Map<String, Object>> loginUser(@RequestBody AdminModel model) {
	
		
		AdminModel user = userService.findByEmail(model.getEmail());
		Map<String, Object> map = new HashMap<String, Object>();

		if(user == null) {
			map.put("message", "Login fail!");
			map.put("status", "Failed");
			map.put("data", null);
			return ResponseEntity.status(412).body(map);
		}
		
		if (user.getPassword().equals(user.getPassword())) {
			map.put("message", "Login Successful");
			map.put("status", "Success");
			map.put("data", user);
			return ResponseEntity.ok(map);
		}
		map.put("message", "Login fail!");
		map.put("status", "Failed");
		map.put("data", null);
		return ResponseEntity.status(412).body(map);
	}

}
