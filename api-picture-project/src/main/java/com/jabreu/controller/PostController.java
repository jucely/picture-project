package com.jabreu.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jabreu.dto.PostDTO;
import com.jabreu.entity.Post;
import com.jabreu.service.PostService;

@RestController
@RequestMapping({ "/post" })
public class PostController {

	@Autowired
	private PostService postService;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@PostMapping(path = "/create")
	@PreAuthorize("hasAuthority('STANDARD_USER')")
	public PostDTO createPost(@RequestBody(required = true) PostDTO newPostDTO) {
		Post newPost = convertToEntity(newPostDTO);
		newPost = postService.create(newPost);
		return convertToDto(newPost);
	}
	
	private Post convertToEntity(PostDTO  postDTO) {
		Post post = modelMapper.map(postDTO, Post.class);
	    return post;
	}
	
	private PostDTO convertToDto(Post post) {
		PostDTO postDto = modelMapper.map(post, PostDTO.class);
	    return postDto;
	}
	
}
