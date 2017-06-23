package com.imooc.homework;

public class Employee {
	//成员属性
	private String name;	//姓名
	private String workNo;	//工号
	private int age;	//年龄
	private String sex;	//性别
	private Department department;	//部门
	private Duty duty;  //职务
	/**
	 * 无参构造
	 */
	public Employee(){
		
	}
	/**
	 * 只给员工姓名、工号、年龄、性别赋值构造函数
	 * @param name 员工姓名
	 * @param workNo 员工工号
	 * @param age 员工年龄
	 * @param sex 员工性别
	 */
	public Employee(String name,String workNo,int age,String sex){
		this.setName(name);
		this.setWorkNo(workNo);
		this.setAge(age);
		this.setSex(sex);
	}
	/**
	 * 给全部属性赋值构造函数   员工所属部门自动将该员工进行关联统计
	 * @param name 员工姓名
	 * @param workNo 员工工号
	 * @param age 员工年龄
	 * @param sex 员工性别
	 * @param department 员工所属部门
	 * @param duty 员工职务信息
	 */
	public Employee(String name,String workNo,int age,String sex,Department department,Duty duty){
		this.setName(name);
		this.setWorkNo(workNo);
		this.setAge(age);
		this.setSex(sex);
		this.setDepartment(department);
		this.setDuty(duty);
		department.addEmployee(this);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkNo() {
		return workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>65||age<18)age=18;
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(sex!="男"&&sex!="女")sex="男";
		this.sex = sex;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Duty getDuty() {
		return duty;
	}
	public void setDuty(Duty duty) {
		this.duty = duty;
	}
	/**
	 * 员工自我介绍方法
	 * @return 员工信息
	 */
	public String info(){
		String str="";
		str+="姓名:"+this.getName()+"\n";
		str+="工号:"+this.getWorkNo()+"\n";
		str+="性别:"+this.getSex()+"\n"; 
		str+="年龄:"+this.getAge()+"\n";
		str+="职务:"+this.getDepartment().getDepartmentName()+this.getDuty().getDutyName();
		return str;
	}
}
