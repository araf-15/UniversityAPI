package com.universityAPI.universityAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityAPI.universityAPI.entities.Department;
import com.universityAPI.universityAPI.repositories.IDepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService{

	@Autowired
	private IDepartmentRepository departmentRepository;
	
	
	@Override
	public List<Department> getDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartment(long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public Department addDepartment(Department department) {
		departmentRepository.save(department);
		return department;
	}

	@Override
	public Department updateDepartment(Department department) {
		departmentRepository.save(department);
		return department;
	}

	@Override
	public void deleteDepartment(long departmentId) {
		Department department = departmentRepository.getOne(departmentId);
		departmentRepository.delete(department);
	}
	
}
