package com.universityAPI.universityAPI.services;

import java.util.List;

import com.universityAPI.universityAPI.entities.Department;

public interface IDepartmentService {
	
	public List<Department> getDepartments();
	
	public Department getDepartment(long departmentId);
	
	public Department addDepartment(Department department);
	
	public Department updateDepartment(Department department);
	
	public void deleteDepartment(long departmentId);
}
