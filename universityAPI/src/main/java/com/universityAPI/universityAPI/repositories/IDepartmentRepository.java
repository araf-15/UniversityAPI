package com.universityAPI.universityAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityAPI.universityAPI.entities.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Long>{
	
}
