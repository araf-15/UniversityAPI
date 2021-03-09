package com.universityAPI.universityAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityAPI.universityAPI.entities.University;
import com.universityAPI.universityAPI.repositories.UniversityRepository;

@Service
public class UniversityService implements IUniversityService{

	@Autowired
	private UniversityRepository universityRepository;
	
	@Override
	public List<University> getUniversities() {
		
		return universityRepository.findAll();
	}

	@Override
	public University getUniversity(long universityId) {
		return universityRepository.findById(universityId).get();
	}

	@Override
	public University addUniversity(University university) {
		universityRepository.save(university);
		return university;
	}

	@Override
	public University updateUniversity(University university) {
		universityRepository.save(university);
		return university;
	}

	@Override
	public void deleteUniversity(long universityId) {
		University university = universityRepository.getOne(universityId);
		universityRepository.delete(university);
	}

}
