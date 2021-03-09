package com.universityAPI.universityAPI.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	
	public Teacher(long id, String firstName, String lastName, String designation) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Designation = designation;
	}
	public Teacher() {
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
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Teacher [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", Designation="
				+ Designation + "]";
	}
}
