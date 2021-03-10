package com.universityAPI.universityAPI.services;

import java.util.List;

import com.universityAPI.universityAPI.entities.Teacher;

public interface ITeacherService {
	
	public List<Teacher> getTeachers();
	
	public Teacher getTeacher(long teacherId);
	
	public Teacher addTeacher(Teacher teacher);
	
	public Teacher updateTeacher(Teacher teacher);
	
	public void deleteTeacher(long teacherId);
}
