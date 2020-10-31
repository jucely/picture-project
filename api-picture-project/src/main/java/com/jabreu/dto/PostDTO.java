package com.jabreu.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Builder
public class PostDTO {

	private String text;
	
	private Date dateCreate;
	
	@Tolerate
	public PostDTO() {}
}
