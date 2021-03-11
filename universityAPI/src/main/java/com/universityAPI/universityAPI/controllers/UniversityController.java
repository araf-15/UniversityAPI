package com.universityAPI.universityAPI.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.universityAPI.universityAPI.entities.University;
import com.universityAPI.universityAPI.services.IUniversityService;

import java.util.List;

@RestController
public class UniversityController {
	
	@Autowired
	private IUniversityService universityService;
	
	private Logger logger = LoggerFactory.getLogger(UniversityController.class);
	
	//Get All universities
	@GetMapping("/universities")
	public List<University> getUniversities() {
		logger.info("Getting all university information");
		return this.universityService.getUniversities();
	}
	
	//Get university by Id
	@GetMapping("/university/{universityId}")
	public University getUniversity(@PathVariable String universityId) {
		return universityService.getUniversity(Long.parseLong(universityId));
	}
	
	//Add a new University
	@PostMapping("/university")
	public ResponseEntity<HttpStatus> addUniversity(@RequestBody University university) {
		try {
			this.universityService.addUniversity(university);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Update an University
	@PutMapping("/university")
	public ResponseEntity<HttpStatus> updateUniversity(@RequestBody University university){
		try {
			this.universityService.updateUniversity(university);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	//delete an University
	@DeleteMapping("/university/{universityId}")
	public ResponseEntity<HttpStatus> deleteUniversity(@PathVariable String universityId){
		try {
			this.universityService.deleteUniversity(Long.parseLong(universityId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
