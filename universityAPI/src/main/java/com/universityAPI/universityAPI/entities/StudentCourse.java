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
	private Student studentId;
	@OneToOne
	private Course courseId;
	
	public StudentCourse(long id, Student studentId, Course courseId) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.courseId = courseId;
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

	public Student getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public Course getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "StudentCourse [id=" + id + ", studentId=" + studentId + ", courseId=" + courseId + "]";
	}
}
