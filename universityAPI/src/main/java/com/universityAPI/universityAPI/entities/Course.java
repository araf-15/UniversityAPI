package com.universityAPI.universityAPI.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course_tbl")
public class Course {
	
	@Id
	private long id;
	private String name;
	private String code;
	
	@OneToOne
	private Teacher courseTeacher;

	
	public Course(long id, String name, String code, Teacher courseTeacher) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.courseTeacher = courseTeacher;
	}

	public Course() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Teacher getCourseTeacher() {
		return this.courseTeacher;
	}

	public void setCourseTeacher(Teacher courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", code=" + code + ", courseTeacher=" + courseTeacher + "]";
	}
	
	
}
