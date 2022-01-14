package com.jee47.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jee47.model.EmployeeModel;


@Repository
public interface EmployeeLoginService extends CrudRepository<EmployeeModel, Integer> {

}
