package com.jabreu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Picture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private PictureAlbum pictureAlbum;
	
	@Tolerate
	public Picture() {}
	
}
