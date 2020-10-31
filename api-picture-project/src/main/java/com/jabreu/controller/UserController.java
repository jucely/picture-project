package com.jabreu.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jabreu.dto.UserDTO;
import com.jabreu.entity.User;
import com.jabreu.service.UserService;

@RestController
@RequestMapping({ "/user" })
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@PostMapping(path = "/register")
	@PreAuthorize("hasAuthority('STANDARD_USER')")
	public UserDTO register(@RequestBody(required = true) UserDTO newUserDTO) {
		User newUser = convertToEntity(newUserDTO);
		newUser = userService.register(newUser);
		return convertToDto(newUser);
	}
	
	private UserDTO convertToDto(User user) {
		UserDTO userDto = modelMapper.map(user, UserDTO.class);
	    return userDto;
	}
	
	private User convertToEntity(UserDTO  userDTO) {
		User user = modelMapper.map(userDTO, User.class);
	    return user;
	}
	
}
