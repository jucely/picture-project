package com.jabreu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jabreu.dao.PictureAlbumDAO;

@Component
public class PictureAlbumService {

	@Autowired
	private PictureAlbumDAO pictureAlbumDAO;


}
