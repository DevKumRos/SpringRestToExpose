package com.example.springRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	Map<Integer, EmployeeDetail> empDetailMap = new HashMap<>();
	@Autowired
	public EmployeeController(){
		empDetailMap.put(1, new EmployeeDetail(1, "Kumar", 32, 35000, "Bangalore", "SultanPalya", "MTP"));
		empDetailMap.put(2, new EmployeeDetail(2, "Monika", 22, 25000, "Bangalore", "RT Nagar", "MTP"));
		empDetailMap.put(3, new EmployeeDetail(3, "Harsh", 18, 15000, "Bangalore", "Hebbal", "FTP"));
		empDetailMap.put(4, new EmployeeDetail(4, "Jeggadesh", 35, 45000, "Belagum", "KR road", "FTP"));
		empDetailMap.put(5, new EmployeeDetail(5, "Shame", 26, 55000, "Mysore", "Jayanagar", "STP"));
		empDetailMap.put(6, new EmployeeDetail(6, "Munish", 38, 65000, "Mangalore", "MHS Road", "FTP"));
	}
	List<EmployeeDetail> employeeDetialList = new ArrayList<>();
	
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
	
	@RequestMapping(value="/employeedetails/{id}")
	public ResponseEntity<EmployeeDetail> getEmployeeDetail(@PathVariable("id") int empId){
		return new ResponseEntity<EmployeeDetail>(getEmployeeDetailById(empId), HttpStatus.OK);
	}

	private EmployeeDetail getEmployeeDetailById(int empId) {
		return empDetailMap.get(empId);
	}

}
