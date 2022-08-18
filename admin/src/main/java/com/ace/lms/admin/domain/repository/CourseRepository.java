package com.ace.lms.admin.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ace.lms.admin.domain.entity.Course;


public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
