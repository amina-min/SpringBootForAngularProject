package com.jee47.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jee47.model.UserModel;


@Repository
public interface UserService extends CrudRepository<UserModel, Long> {

}
