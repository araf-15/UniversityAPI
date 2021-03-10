package com.universityAPI.universityAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityAPI.universityAPI.entities.StudentCourse;
import com.universityAPI.universityAPI.repositories.IStudentCourseRepository;

@Service
public class StudentCourseService implements IStudentCourseService{

	@Autowired
	private IStudentCourseRepository studentCourseRepository;
	
	@Override
	public List<StudentCourse> getStudentCourses() {
		return studentCourseRepository.findAll();
	}

	@Override
	public StudentCourse getStudentCourse(long studentCourseId) {
		return studentCourseRepository.findById(studentCourseId).get();
	}

	@Override
	public StudentCourse addStudentCourse(StudentCourse studentCourse) {
		studentCourseRepository.save(studentCourse);
		return studentCourse;
	}

	@Override
	public StudentCourse updateStudentCourse(StudentCourse studentCourse) {
		studentCourseRepository.save(studentCourse);
		return studentCourse;
	}

	@Override
	public void deleteStudentCourse(long studentCourseId) {
		StudentCourse studentCourse = studentCourseRepository.getOne(studentCourseId);
		studentCourseRepository.delete(studentCourse);
	}

}
