package com.ace.lms.admin.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="batch")
public class Batch implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(length = 50, nullable = false, unique = true)
    private String name;
	
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
    private Date startDate;
	
	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
    private Date endDate;
	
	@ManyToOne
	private Course course;
}
