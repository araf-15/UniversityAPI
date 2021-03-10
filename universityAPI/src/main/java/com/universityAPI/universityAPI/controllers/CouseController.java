package com.universityAPI.universityAPI.controllers;

import java.util.List;

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

import com.universityAPI.universityAPI.entities.Course;
import com.universityAPI.universityAPI.services.ICourseService;

@RestController
public class CouseController {
	
	@Autowired
	private ICourseService courseService;
	
	//Get all courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	//Get Course By Id
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return courseService.getCourse(Long.parseLong(courseId));
	}
	
	//Add a new Course
	@PostMapping("/course")
	public ResponseEntity<HttpStatus> addCourse(@RequestBody Course course){
		try {
			this.courseService.addCourse(course);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Update a Course
	@PutMapping("/course")
	public ResponseEntity<HttpStatus> updateCourse(@RequestBody Course course){
		try {
			this.courseService.updateCourse(course);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//Delete Course
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
