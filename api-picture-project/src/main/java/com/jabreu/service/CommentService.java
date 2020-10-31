package com.jabreu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jabreu.dao.CommentDAO;

@Component
public class CommentService {

	@Autowired
	private CommentDAO commentDAO;


}
