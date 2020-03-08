package com.jpa.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.app.entity.Department;
import com.jpa.app.entity.Employee;
import com.jpa.app.repository.DepartmentRepository;
import com.jpa.app.repository.EmployeeRepository;

@RestController
public class JpaController {

	@Autowired
	private EmployeeRepository empRepository;

	@Autowired
	private DepartmentRepository deptRepositoey;
	

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	@RequestMapping(value = "/employees/add", method = RequestMethod.POST, produces = "application/json")
	public String addEmployee(@RequestBody Employee empObj) {
		
		 if(empRepository.save(empObj)!=null)
		 {
			 return "Employee "+empObj.getFirstname()+" has been added successfully";
		 }
		 else
		 {
			 return "Employee "+empObj.getFirstname()+" has not added";
		 }
	}

	@RequestMapping(value = "/employees/delete/{employee}", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteEmployee(@PathVariable(name="employee") int empid) {
		empRepository.deleteById(empid);
		return "Employee "+ empid +" has been removed successfully";
	}

	@RequestMapping(value = "/departments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Department> getAllDepartments() {
		return deptRepositoey.findAll();
	}

	@RequestMapping(value = "/departments/add", method = RequestMethod.POST, produces = "application/json")
	public String addDepartments(@RequestBody Department deptObj) {
		if(deptRepositoey.save(deptObj)!=null)
		 {
			 return "Department "+deptObj.getDepartmentname()+" has been added successfully";
		 }
		 else
		 {
			 return "Department "+deptObj.getDepartmentname()+" has not added";
		 }
	}

	@RequestMapping(value = "/departments/delete/{depId}", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteDepartments(@PathVariable(name="depId") int deptId ) {
		
		deptRepositoey.deleteById(deptId);
		return "Employee "+ deptId +" has been removed successfully";
	}

}
