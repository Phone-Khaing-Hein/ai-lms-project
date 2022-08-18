package com.ace.lms.admin.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 20, nullable = false)
	private String name;
	@Column(length = 255, nullable = false, unique = true)
	private String password;
	@Column(length = 50, nullable = false, unique = true)
	private String email;
	@ManyToOne
	private Batch batch;
}
