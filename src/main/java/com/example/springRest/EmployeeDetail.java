package com.example.springRest;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDetail extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int salary;
	private String address;
	private String city;
	private String workLocation;
	
	
	public EmployeeDetail(int id, String name, int age,
			int salary, String address, String city,
			String workLocation) {
		super(id, name, age);
		this.salary = salary;
		this.address = address;
		this.city = city;
		this.workLocation = workLocation;
	}
	public EmployeeDetail() {
		super();
	}
	public EmployeeDetail(int salary, String address, String city,
			String workLocation) {
		super();
		this.salary = salary;
		this.address = address;
		this.city = city;
		this.workLocation = workLocation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	
	
	

}
