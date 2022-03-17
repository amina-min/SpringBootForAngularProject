package com.jee47.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jee47.model.Location;

public interface LocationRepo extends JpaRepository<Location, Integer> {
	List<Location> findByEmpId(int empId);
}
