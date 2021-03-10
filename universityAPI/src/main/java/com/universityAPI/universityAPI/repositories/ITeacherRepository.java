package com.universityAPI.universityAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityAPI.universityAPI.entities.Teacher;

public interface ITeacherRepository extends JpaRepository<Teacher, Long>{

}
