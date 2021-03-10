package com.universityAPI.universityAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityAPI.universityAPI.entities.Course;
import com.universityAPI.universityAPI.repositories.ICourseRepository;

@Service
public class CourseService implements ICourseService{
	
	@Autowired
	private ICourseRepository courseRepository;
	
	@Override
	public List<Course> getCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		courseRepository.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseRepository.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		Course course = courseRepository.getOne(courseId);
		courseRepository.delete(course);
	}

}
