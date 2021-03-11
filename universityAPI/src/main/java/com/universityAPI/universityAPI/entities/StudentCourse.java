package com.universityAPI.universityAPI.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentcourses_tbl")
public class StudentCourse {
	
	@Id
	private long id;
	@OneToOne
	private Student student;
	@OneToOne
	private Course course;
	
	public StudentCourse(long id, Student studentId, Course courseId) {
		super();
		this.id = id;
		this.student = studentId;
		this.course = courseId;
	}

	public StudentCourse() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentCourse [id=" + id + ", studentId=" + this.student + ", courseId=" + this.course + "]";
	}
}
