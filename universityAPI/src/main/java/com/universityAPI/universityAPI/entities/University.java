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
	private String vc_name;
	
	public University() {
		super();
	}

	public University(long id, String name, String address, String vc_name) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.vc_name = vc_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVc_name() {
		return vc_name;
	}

	public void setVc_name(String vc_name) {
		this.vc_name = vc_name;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", address=" + address + ", vc_name=" + vc_name + "]";
	}
}
