package com.universityAPI.universityAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityAPI.universityAPI.entities.StudentCourse;

public interface IStudentCourseRepository extends JpaRepository<StudentCourse, Long>{
	
}
