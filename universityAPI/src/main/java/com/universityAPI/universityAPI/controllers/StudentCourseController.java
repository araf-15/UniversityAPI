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

import com.universityAPI.universityAPI.entities.StudentCourse;
import com.universityAPI.universityAPI.services.IStudentCourseService;

@RestController
public class StudentCourseController {
	@Autowired
	private IStudentCourseService studentCourseService;
	
	//Get All StudentCourses
	@GetMapping("/studentcourses")
	public List<StudentCourse> getStudentCourses(){
		return this.studentCourseService.getStudentCourses();
	}
	
	//Get StudentCourse By Id
	@GetMapping("/studentcourse/{studentcourseId}")
	public StudentCourse getStudentCourse(@PathVariable String studentcourseId){
		return studentCourseService.getStudentCourse(Long.parseLong(studentcourseId));
	}
	
	//Add a new StudentCourse
	@PostMapping("/studentcourse")
	public ResponseEntity<HttpStatus> addStudentCourse(@RequestBody StudentCourse studentcourse){
		try {
			this.studentCourseService.addStudentCourse(studentcourse);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Update a StudentCourse
	@PutMapping("/studentcourse")
	public ResponseEntity<HttpStatus> updateDepartment(@RequestBody StudentCourse studentcourse){
		try {
			this.studentCourseService.updateStudentCourse(studentcourse);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Delete StudentCourse
	@DeleteMapping("/student/{studentcourseId}")
	public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable String studentcourseId){
		try {
			this.studentCourseService.deleteStudentCourse(Long.parseLong(studentcourseId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
