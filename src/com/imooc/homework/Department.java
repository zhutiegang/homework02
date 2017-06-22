package com.imooc.homework;

public class Department {
	private String departmentNo;
	private String departmentName;
	private Employee[] myEmployees;
	
	public Department(){
		
	}
	
	public Department(String departmentNo, String departmentName){
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee[] getMyEmployees() {
		return myEmployees;
	}

	public void setMyEmployees(Employee[] myEmployees) {
		this.myEmployees = myEmployees;
	}

}
