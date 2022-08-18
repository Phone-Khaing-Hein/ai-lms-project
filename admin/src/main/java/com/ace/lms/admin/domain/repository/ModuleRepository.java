package com.ace.lms.admin.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ace.lms.admin.domain.entity.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer> {

}
