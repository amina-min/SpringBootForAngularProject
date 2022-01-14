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

import com.jee47.model.AdminModel;
import com.jee47.model.EmployeeModel;
import com.jee47.service.AdminService;
import com.jee47.service.EmployeeLoginService;


@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class EmployeeController {
	
	public class LoginController {
		

		@Autowired
		private EmployeeLoginService empService;
		
		
		
		@GetMapping("/")
		public String index() {
			return "Hello World";
		}
		
		@PostMapping("/employeelogin")
	    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody EmployeeModel employee) {
	        List<EmployeeModel> emp = (List<EmployeeModel>) empService.findAll();
	        Map<String, Object> map = new HashMap<String, Object>();
	        
	        for (EmployeeModel other : emp) {
	            if (other.getEmployeeEmail().equals(employee.getEmployeeEmail()) &&  other.getEmployeePassword().equals(employee.getEmployeePassword())) {
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
		
		
		
		
		
		


	// (signup/update/save)
	@PostMapping(value = "/empSignup")
	public ResponseEntity<?> save(@RequestBody EmployeeModel entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			EmployeeModel user = empService.save(entity);
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
	
	    
	}
		
}
