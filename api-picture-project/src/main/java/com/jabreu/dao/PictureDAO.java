package com.jabreu.dao;

import org.springframework.data.repository.CrudRepository;

import com.jabreu.entity.Picture;

public interface PictureDAO extends CrudRepository<Picture, Long> {

}
