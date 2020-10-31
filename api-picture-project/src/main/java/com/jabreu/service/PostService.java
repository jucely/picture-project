package com.jabreu.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jabreu.dao.PostDAO;
import com.jabreu.entity.Post;

@Component
public class PostService {

	@Autowired
	private PostDAO postDAO;


	public Post create(Post post) {
		post.setDateCreate(new Date());
		return postDAO.save(post);
	}
	
}
