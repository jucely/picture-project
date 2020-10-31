package com.jabreu.dao;

import org.springframework.data.repository.CrudRepository;

import com.jabreu.entity.Comment;

public interface CommentDAO extends CrudRepository<Comment, Long> {

}
