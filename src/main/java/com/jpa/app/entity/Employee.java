package com.jpa.app.entity;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="employee", schema="jpaschema")
public class Employee implements Serializable {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private static final long serialVersionUID = 3781504125934948124L;

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="first_name")
	String firstname;
	
	@Column(name="last_name")
	String lastname;
	
	@Column(name="address")
	String address;
	
}
