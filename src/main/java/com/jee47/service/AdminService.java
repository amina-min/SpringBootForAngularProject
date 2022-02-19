package com.jee47.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jee47.model.AdminModel;


@Repository
public interface AdminService extends JpaRepository<AdminModel, Long> {
	
	AdminModel findByEmail(String email);
}
