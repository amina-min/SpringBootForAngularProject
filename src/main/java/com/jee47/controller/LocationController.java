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

import com.jee47.model.Location;
import com.jee47.service.LocationRepo;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)

public class LocationController {
	@Autowired
	private LocationRepo repo;
	
	
	@PostMapping("/saveLocation")
	public ResponseEntity<?> Savelatlong(@RequestBody Location entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Location location = repo.save(entity);
			map.put("message", "location successfully");
			map.put("data", location);
			map.put("statusCode", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "location saved failed");
			map.put("data", null);
			map.put("statusCode", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	
	@GetMapping("/getLocation/{empId}")
	public ResponseEntity<?>getLocation(@PathVariable(value = "empId") Integer empId){
		Map<String, Object> map = new HashMap<>();		
		try {
			List<Location> list = (List<Location>) repo.findByEmpId(empId);
			map.put("message", " get successfully");
			map.put("data", list);
			map.put("statusCode", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "fetch failed");
			map.put("data", null);
			map.put("statusCode", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
		
	}
	
}
