package com.ace.lms.admin.domain.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Data
@Table(name="resource")
public class Resource implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 255, nullable = false, unique = true)
    private String resource;
    @ManyToOne
    private Module module;
}
