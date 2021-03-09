package com.universityAPI.universityAPI.services;

import java.util.List;

import com.universityAPI.universityAPI.entities.University;

public interface IUniversityService {
	
	public List<University> getUniversities();
	
	public University getUniversity(long universityId);
	
	public University addUniversity(University university);
	
	public University updateUniversity(University university);
	
	public void deleteUniversity(long universityId);
}
