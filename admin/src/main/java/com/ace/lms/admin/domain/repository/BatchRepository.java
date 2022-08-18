package com.ace.lms.admin.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ace.lms.admin.domain.entity.Batch;

public interface BatchRepository extends JpaRepository<Batch, Integer>{
    
}
