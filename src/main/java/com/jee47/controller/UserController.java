package com.jee47.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jee47.model.UserModel;
import com.jee47.service.UserService;



@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	UserService userService;

	// (signup/update/save)
	@PostMapping(value = "/signup")
	public ResponseEntity<?> save(@RequestBody UserModel entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			UserModel user = userService.save(entity);
			map.put("message", "Data save successfully");
			map.put("Data", user);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Data saved failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	


	
	// (signup/update/save) it also
//	@PostMapping("/signup")
//	UserModel user(@RequestBody UserModel user) {
//	    return userService.save(user);
//	  }
//	

}
