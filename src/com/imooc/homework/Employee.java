package com.imooc.homework;

public class Employee {
	private String name;
	private String workNo;
	private int age;
	private String sex;
	private Department department;
	private Duty duty;  //ְ��
	public Employee(){
		
	}
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
		if(sex!="��"&&sex!="Ů")sex="��";
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
	public String info(){
		String str="";
		str+="����:"+this.getName()+"\n";
		str+="����:"+this.getWorkNo()+"\n";
		str+="�Ա�:"+this.getSex()+"\n"; 
		str+="����:"+this.getAge()+"\n";
		str+="ְ��:"+this.getDepartment().getDepartmentName()+this.getDuty().getDutyName();
		return str;
	}
}
