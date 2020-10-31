package com.jabreu.dao;

import org.springframework.data.repository.CrudRepository;

import com.jabreu.entity.Post;

public interface PostDAO extends CrudRepository<Post, Long> {

}
