package com.universityAPI.universityAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityAPI.universityAPI.entities.Teacher;
import com.universityAPI.universityAPI.repositories.ITeacherRepository;

@Service
public class TeacherService implements ITeacherService{

	@Autowired
	private ITeacherRepository teacherRepository;
	
	@Override
	public List<Teacher> getTeachers() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacher(long teacherId) {
		return teacherRepository.findById(teacherId).get();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
		return teacher;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
		return teacher;
	}

	@Override
	public void deleteTeacher(long teacherId) {
		Teacher teacher = teacherRepository.getOne(teacherId);
		teacherRepository.delete(teacher);
	}

}
