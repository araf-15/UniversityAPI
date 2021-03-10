package com.universityAPI.universityAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityAPI.universityAPI.entities.Course;

public interface ICourseRepository extends JpaRepository<Course, Long>{
	
}
