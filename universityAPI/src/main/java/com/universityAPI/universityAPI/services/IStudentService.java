package com.universityAPI.universityAPI.services;

import java.util.*;

import com.universityAPI.universityAPI.entities.Student;

public interface IStudentService {
	
	public List<Student> getStudents();

	public Student getStudent(long studentId);
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(long studentId);
}
