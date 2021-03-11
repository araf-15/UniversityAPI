package com.universityAPI.universityAPI.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="university_tbl")
public class University {
	@Id
	private long id;
	private String name;
	private String address;
	private String vcName;
	
	public University() {
		super();
	}

	public University(long id, String name, String address, String vcName) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.vcName = vcName;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	

	public String getVcName() {
		return this.vcName;
	}

	public void setVcName(String vcName) {
		this.vcName = vcName;
	}

	@Override
	public String toString() {
		return "University [id=" + this.id + ", name=" + this.name + ", address=" + this.address + ", VC Name=" + this.vcName + "]";
	}
}
