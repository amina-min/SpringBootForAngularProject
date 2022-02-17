package com.jee47.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jee47.model.Employee;
import com.jee47.model.EmployeeRatingModel;
import com.jee47.service.EmployeeRatingService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)


public class EmployeeRatingController {

	
	@Autowired
	private EmployeeRatingService empRatService;
	
	
	
	@PostMapping("/saveEmpRatings")
	public ResponseEntity<?> save(@RequestBody EmployeeRatingModel entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			EmployeeRatingModel employee = empRatService.save(entity);
			map.put("message", "save successfully");
			map.put("Data", employee);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "saved failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	
	
	@GetMapping("/employeeInformation/getAll")
	public ResponseEntity<?> getEmployeeInformation() {
		Map<String, Object> map = new HashMap<>();
		try {

			List<EmployeeRatingModel> employee = (List<EmployeeRatingModel>) empRatService.findAll();
			map.put("message", "Employee get successfully");
			map.put("Data", employee);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee fetch failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}

}
