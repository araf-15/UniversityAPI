package com.universityAPI.universityAPI.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "teacher_tbl")
public class Teacher {
	@Id
	private long Id;
	private String firstName;
	private String lastName;
	private String Designation;
	
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
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Designation = designation;
		this.department = department;
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

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Teacher [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", Designation="
				+ Designation + ", department=" + department + "]";
	}
}
