package com.imooc.homework;

public class Test {

	public static void main(String[] args) {
		Department dept_personnel=new Department("D01","���²�");
		Duty duty01=new Duty();
		//(String name,String workNo,int age,String sex,Department department,Duty duty)
		Employee zhangming=new Employee("����","S001",29,"��",dept_personnel,duty01);
		System.out.println(zhangming.info());

	}

}
