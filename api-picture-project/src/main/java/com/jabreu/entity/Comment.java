package com.jabreu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Entity
@Builder
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private User user;
	
	@Column(nullable = false)
	private String text; 
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@ManyToOne
	@JoinColumn(nullable = true)
	private Post post;
	
	@Tolerate
	public Comment() {}
	
}
