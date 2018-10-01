package com.example.springRest;

import org.springframework.stereotype.Component;

@Component
public class Department {

	public int deptId;
	public String deptName;
	public int deptCode;
	
	

	public Department() {
		super();
	}


	public Department(int deptId, String deptName, int deptCode) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptCode = deptCode;
	}
	

	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public int getDeptCode() {
		return deptCode;
	}


	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	
}
