package com.universityAPI.universityAPI.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_tbl")
public class Student {
	@Id
	private long Id;
	private String firstName;
	private String lastName;
	private int semester;
	
	@ManyToOne
	private Department department;
	
	

	public Student(long id, String firstName, String lastName, int semester, Department department) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.semester = semester;
		this.department = department;
	}
	
	public Student() {
		super();
	}
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", semester=" + semester
				+ ", department=" + department + "]";
	}
}
