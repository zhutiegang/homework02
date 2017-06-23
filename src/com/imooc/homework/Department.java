package com.imooc.homework;

public class Department {
	private String departmentNo;
	private String departmentName;
	private Employee[] myEmployees;
	private int myEmployeesNum;
	
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
		if(myEmployees==null){
			myEmployees=new Employee[200];
		}
		return myEmployees;
	}

	public void setMyEmployees(Employee[] myEmployees) {
		this.myEmployees = myEmployees;
	}
	
	public int getMyEmployeesNum() {
		return myEmployeesNum;
	}

	public void setMyEmployeesNum(int myEmployeesNum) {
		this.myEmployeesNum = myEmployeesNum;
	}

	public void addEmployee(Employee employee){
		for(int i=0;i<this.getMyEmployees().length;i++){
			if((this.getMyEmployees()[i])==null){
				this.getMyEmployees()[i]=employee;
				this.setMyEmployeesNum(i+1);
				break;
			}
		}
	}

}
