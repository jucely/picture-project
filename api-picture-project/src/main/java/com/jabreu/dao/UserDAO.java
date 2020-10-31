package com.jabreu.dao;

import org.springframework.data.repository.CrudRepository;

import com.jabreu.entity.User;

public interface UserDAO extends CrudRepository<User, Long> {

}
