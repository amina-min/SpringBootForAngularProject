package com.jee47.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jee47.model.Employee;


@Repository
public interface EmployeeService extends JpaRepository<Employee, Integer> {
    

}
