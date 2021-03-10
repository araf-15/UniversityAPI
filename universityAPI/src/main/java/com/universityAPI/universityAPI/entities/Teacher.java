package com.universityAPI.universityAPI.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "teacher_tbl")
public class Teacher {
	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String designation;
	
	@ManyToOne
	private Department department;
	
//	@OneToOne
//	private Course course;

	public Teacher() {
		super();
	}

	public Teacher(long id, String firstName, String lastName, 
			String designation, Department department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.department = department;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Teacher [Id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", Designation="
				+ this.designation + ", department=" + this.department + "]";
	}
}
