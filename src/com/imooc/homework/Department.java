package com.imooc.homework;

public class Department {
	//成员属性
	private String departmentNo;	//部门编号
	private String departmentName;	//部门名称
	private Employee[] myEmployees;	//部门员工
	private int myEmployeesNum;	//部门员工人数
	/**
	 * 无参构造
	 */
	public Department(){
		
	}
	/**
	 * 带参构造 实现对部门编号、部门名称赋值
	 * @param departmentNo
	 * @param departmentName
	 */
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
	/**
	 * 部门添加员工
	 * @param employee 员工对实例
	 */
	public void addEmployee(Employee employee){
		for(int i=0;i<this.getMyEmployees().length;i++){
			if((this.getMyEmployees()[i])==null){
				this.getMyEmployees()[i]=employee;
				this.setMyEmployeesNum(i+1);
				break;
			}
		}
	}
	/**
	 * @return 该部门员工信息
	 */
	public String info(){
		String str="";
		str+=this.getDepartmentName()+"总共有"+this.getMyEmployeesNum()+"名员工";
		return str;
	}

}
