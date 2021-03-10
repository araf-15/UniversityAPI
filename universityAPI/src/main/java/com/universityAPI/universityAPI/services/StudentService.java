package com.universityAPI.universityAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityAPI.universityAPI.entities.Student;
import com.universityAPI.universityAPI.repositories.IStudentRepository;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private IStudentRepository studentRepository;
	
	
	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(long studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	public Student addStudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	@Override
	public void deleteStudent(long studentId) {
		Student student = studentRepository.getOne(studentId);
		studentRepository.delete(student);
	}
	
}
