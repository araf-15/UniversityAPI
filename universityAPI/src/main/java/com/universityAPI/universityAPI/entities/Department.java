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
	private long Id;
	private String Name;
	
	@OneToMany(mappedBy = "department")
	private List<Teacher> teachers;
	
	@OneToMany(mappedBy = "department")
	private List<Student> students;

	public Department() {
		super();
	}

	public Department(long id, String name, List<Teacher> teachers, List<Student> students) {
		super();
		Id = id;
		Name = name;
		this.teachers = teachers;
		this.students = students;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Department [Id=" + Id + ", Name=" + Name + ", teachers=" + teachers + "]";
	}	
}
