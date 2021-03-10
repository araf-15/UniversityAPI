package com.universityAPI.universityAPI.controllers;

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

import com.universityAPI.universityAPI.entities.Student;
import com.universityAPI.universityAPI.services.IStudentService;

import java.util.List;

@RestController
public class StudentController {
	
	@Autowired
	private IStudentService studentService;
	
	//Get all students
	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
	}
	
	//Get Student By Id
	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable String studentId){
		return studentService.getStudent(Long.parseLong(studentId));
	}
	
	//Add a new Student
	@PostMapping("/student")
	public ResponseEntity<HttpStatus> addDepartment(@RequestBody Student student){
		try {
			this.studentService.addStudent(student);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Update a Student
	@PutMapping("/student")
	public ResponseEntity<HttpStatus> updateDepartment(@RequestBody Student student){
		try {
			this.studentService.updateStudent(student);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Delete Student
	@DeleteMapping("/student/{studentId}")
	public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable String studentId){
		try {
			this.studentService.deleteStudent(Long.parseLong(studentId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
