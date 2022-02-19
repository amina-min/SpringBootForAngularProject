package com.jee47.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jee47.model.Employee;
import com.jee47.service.EmployeeService;




@RestController
@CrossOrigin(origins = "*", maxAge = 3600)



public class AdminController {

	@Autowired
	private EmployeeService employeeservice;
	
	
	
	
	
	@PostMapping("/employee/saveEmployee")
	public ResponseEntity<?> save(@RequestBody Employee entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Employee employee = employeeservice.save(entity);
			map.put("message", "Employee save successfully");
			map.put("data", employee);
			map.put("statusCode", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee saved failed");
			map.put("data", null);
			map.put("statusCode", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	

	
	@GetMapping("/employee/getOne/{id}")
	public ResponseEntity<?> findById(@PathVariable(value = "id") Integer id) {
		Map<String, Object> map = new HashMap<>();
		try {
			Employee employee = employeeservice.findById(id).get();
			map.put("message", "Employee get successfully");
			map.put("data", employee);
			map.put("statusCode", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee fetch failed");
			map.put("data", null);
			map.put("statusCode", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("/employee/getAll")
	public ResponseEntity<?> getEmployee() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Employee> employee =(List<Employee>) employeeservice.findAll();
			map.put("message", "Employee get successfully");
			map.put("data", employee);
			map.put("statusCode", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee fetch failed");
			map.put("data", null);
			map.put("statusCode", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}

	
	

	
	@PostMapping("/employee/update")
	public ResponseEntity<?> update(@RequestBody Employee entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			Employee employee = employeeservice.save(entity);
			map.put("message", "Employee updated successfully");
			map.put("data", employee);
			map.put("statusCode", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee updated failed");
			map.put("data", null);
			map.put("statusCode", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}

	
	
	@GetMapping(value = "/employee/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
		Map<String, Object> map = new HashMap<>();
		Employee employee = employeeservice.findById(id).get();
		try {
			employeeservice.delete(employee);
			map.put("message", "Employee deleted successfully");
			map.put("data", employee);
			map.put("statusCode", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee deletation failed");
			map.put("data", null);
			map.put("statusCode", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
}
