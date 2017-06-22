package com.imooc.homework;

public class Test {

	public static void main(String[] args) {
		Department dept_personnel=new Department("D01","人事部");
		Duty duty01=new Duty();
		//(String name,String workNo,int age,String sex,Department department,Duty duty)
		Employee zhangming=new Employee("张铭","S001",29,"男",dept_personnel,duty01);
		System.out.println(zhangming.info());

	}

}
