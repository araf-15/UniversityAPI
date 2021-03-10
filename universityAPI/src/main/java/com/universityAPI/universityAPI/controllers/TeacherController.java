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

import com.universityAPI.universityAPI.entities.Teacher;
import com.universityAPI.universityAPI.services.ITeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private ITeacherService teacherService;
	
	//Get all teachers
	@GetMapping("/teachers")
	public List<Teacher> getTeachers(){
		return this.teacherService.getTeachers();
	}
	
	//Get Teacher by Id
	@GetMapping("/teacher/{teacherId}")
	public Teacher getTeacher(@PathVariable String teacherId) {
		return teacherService.getTeacher(Long.parseLong(teacherId));
	}
	
	//Add a new Teacher
	@PostMapping("/teacher")
	public ResponseEntity<HttpStatus> addDepartment(@RequestBody Teacher teacher){
		try {
			this.teacherService.addTeacher(teacher);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Update Teacher
	@PutMapping("/teacher")
	public ResponseEntity<HttpStatus> updateDepartment(@RequestBody Teacher teacher){
		try {
			this.teacherService.updateTeacher(teacher);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Delete Teacher
	@DeleteMapping("/teacher/{teacherId}")
	public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable String teacherId){
		try {
			this.teacherService.deleteTeacher(Long.parseLong(teacherId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
