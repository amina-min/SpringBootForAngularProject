package com.jee47.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)



public class AdminController {

	@Autowired
	private EmployeeService employeeservice;
	
	
	
	@PostMapping("/employee/saveEmployee")
	Employee advertisingForm(@RequestBody Employee  employees) {
	    return employeeservice.save(employees);
	  }
	
	
	@GetMapping("/employee/getAll")
	private List<Employee> findAll(){
	 return  (List<Employee>) (employeeservice).findAll();
		
	}
	
	@GetMapping("/employee/getOne/{id}")
	private Employee findById(@PathVariable int id) {
		
		return employeeservice.findById((long) id).get();
	}
	
	

	@PutMapping("/employee/update")
	private Employee advertisingFormU(@PathVariable int id,  @RequestBody Employee  employees) {
		employees.setId(id);
		return employeeservice.save(employees);
	  }
	
	@DeleteMapping("/employee/delete/{id}")
	private void delete(@PathVariable int id) {
		employeeservice.deleteById((long) id);
	}
	
}
