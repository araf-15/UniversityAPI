package com.universityAPI.universityAPI.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "department_tbl")
public class Department {
	
	@Id
	private long id;
	private String name;
	
	@OneToMany(mappedBy = "department")
	private List<Teacher> teachers;
	
	@OneToMany(mappedBy = "department")
	private List<Student> students;

	public Department() {
		super();
	}

	public Department(long id, String name, List<Teacher> teachers, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.teachers = teachers;
		this.students = students;
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

	@Override
	public String toString() {
		return "Department [Id=" + this.id + ", Name=" + this.name + ", teachers=" + teachers + "]";
	}	
}
