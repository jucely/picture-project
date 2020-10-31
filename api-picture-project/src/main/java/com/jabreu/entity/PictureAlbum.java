package com.jabreu.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Entity
@Builder
public class PictureAlbum {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private User user;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreate;
	
	@OneToMany(mappedBy = "pictureAlbum", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private List<Picture> pictures;
	
	@Tolerate
	public PictureAlbum() {}
	
}
