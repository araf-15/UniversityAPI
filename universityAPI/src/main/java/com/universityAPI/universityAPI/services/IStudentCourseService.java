package com.universityAPI.universityAPI.services;

import java.util.List;

import com.universityAPI.universityAPI.entities.StudentCourse;

public interface IStudentCourseService {
	
	public List<StudentCourse> getStudentCourses();
	
	public StudentCourse getStudentCourse(long studentCourseId);
	
	public StudentCourse addStudentCourse(StudentCourse studentCourse);
	
	public StudentCourse updateStudentCourse(StudentCourse studentCourse);
	
	public void deleteStudentCourse(long studentCourseId);
}
