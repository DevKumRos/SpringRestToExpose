package com.example.springRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping(value="/employees")
	public ResponseEntity<List<Employee>> getEmployees(){
		
		return new ResponseEntity<List<Employee>>(getEmployeeDatas(), HttpStatus.OK);
	}

	private List<Employee> getEmployeeDatas() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Kumar", 32));
		employeeList.add(new Employee(2, "Monika", 22));
		employeeList.add(new Employee(3, "Harsh", 18));
		employeeList.add(new Employee(4, "Jeggadesh", 35));
		employeeList.add(new Employee(5, "Shame", 26));
		employeeList.add(new Employee(6, "Munish", 38));
		
		return employeeList;
	}
	
	@RequestMapping(value="/departmentList")
	public ResponseEntity<List<Department>> getDepartments(){
		List<Department> departmentList = new ArrayList<>();
		departmentList.add(new Department(1, "Software", 001));
		departmentList.add(new Department(2, "Hardware", 002));
		departmentList.add(new Department(3, "BPO", 003));
		departmentList.add(new Department(4, "Testing", 004));
		departmentList.add(new Department(5, "Cloud Developer", 005));
		departmentList.add(new Department(6, "Cogntive", 006));
		
		return new ResponseEntity<List<Department>>(departmentList, HttpStatus.OK);
	}

}
