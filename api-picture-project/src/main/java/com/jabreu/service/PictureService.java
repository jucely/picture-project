package com.jabreu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jabreu.dao.PictureDAO;

@Component
public class PictureService {

	@Autowired
	private PictureDAO pictureDAO;


}
