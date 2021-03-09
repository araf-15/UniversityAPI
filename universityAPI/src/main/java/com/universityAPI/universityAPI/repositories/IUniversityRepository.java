package com.universityAPI.universityAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universityAPI.universityAPI.entities.University;

public interface IUniversityRepository extends JpaRepository<University, Long>{

}
