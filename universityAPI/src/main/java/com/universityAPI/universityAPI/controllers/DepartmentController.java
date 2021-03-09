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

import com.universityAPI.universityAPI.entities.Department;
import com.universityAPI.universityAPI.services.IDepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private IDepartmentService departmentService;
	
	//Get all departments
	@GetMapping("/departments")
	public List<Department> getDepartments(){
		return this.departmentService.getDepartments();
	}
	
	//get a department by Id
	@GetMapping("/department/{departmentId}")
	public Department getDepartment(@PathVariable String departmentId) {
		return departmentService.getDepartment(Long.parseLong(departmentId));
	}
	
	//Add a new department
	@PostMapping("/department")
	public ResponseEntity<HttpStatus> addDepartment(@RequestBody Department department){
		try {
			this.departmentService.addDepartment(department);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Update a department
	@PutMapping("/department")
	public ResponseEntity<HttpStatus> updateDepartment(@RequestBody Department department){
		try {
			this.departmentService.updateDepartment(department);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Delete a department
	@DeleteMapping("/department/{departmentId}")
	public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable String departmentId){
		try {
			this.departmentService.deleteDepartment(Long.parseLong(departmentId));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
