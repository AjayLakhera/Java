package com.jpa.app.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="department", schema="jpaschema")
public class Department implements Serializable {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	private static final long serialVersionUID = -694938411003350214L;

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="department_name")
	String departmentname;
	
	@Column(name="employee_id")
	int employeeid;
}


