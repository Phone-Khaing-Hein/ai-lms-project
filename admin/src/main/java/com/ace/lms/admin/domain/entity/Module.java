package com.ace.lms.admin.domain.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="module")
@Data
public class Module implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false, unique = true)
    private String name;

    @ManyToOne
    private Course course;

    @Transient
    private MultipartFile resource;
}
