package com.universityAPI.universityAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityAPI.universityAPI.entities.Student;

public interface IStudentRepository extends JpaRepository<Student, Long>{

}
