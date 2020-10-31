package com.jabreu.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jabreu.dao.UserDAO;
import com.jabreu.entity.User;

@Component
public class UserService {

	@Autowired
	private UserDAO userDAO;


	public User register(User user) {
		user.setDateRegister(new Date());
		return userDAO.save(user);
	}
	
	
}
