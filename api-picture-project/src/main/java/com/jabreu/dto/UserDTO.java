package com.jabreu.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Builder
public class UserDTO {

	private String name;
	
	private String email;
	
	private Date dateRegister;
	
	@Tolerate
	public UserDTO() {}
	
}
