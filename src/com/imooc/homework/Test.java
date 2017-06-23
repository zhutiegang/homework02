package com.imooc.homework;

public class Test {

	public static void main(String[] args) {
		//部门
		Department personnel=new Department("D01","人事部");
		Department marketing=new Department("D02","市场部");
		//职务
		Duty manager=new Duty("Z01","经理");
		Duty assistant=new Duty("Z02","助理");
		Duty clerk=new Duty("Z03","职员");
		//给员工全部属性赋值
		Employee zhangming=new Employee("张铭","S001",29,"男",personnel,manager);
		Employee liaiai=new Employee("李艾爱","S002",21,"女",personnel,assistant);
		Employee sunchao=new Employee("孙超","S004",29,"男",personnel,clerk);
		Employee zhangmeimei=new Employee("张美美","S005",26,"女",marketing,clerk);
		Employee landi=new Employee("蓝迪","S006",37,"男",marketing,manager);
		//只给员工姓名、工号、年龄、性别赋值
		Employee mili=new Employee("米莉","s007",24,"女");
		mili.setDepartment(marketing);
		marketing.addEmployee(mili);
		mili.setDuty(clerk);
		System.out.println(zhangming.info());
		System.out.println("=============================");
		System.out.println(liaiai.info());
		System.out.println("=============================");
		System.out.println(sunchao.info());
		System.out.println("=============================");
		System.out.println(zhangmeimei.info());
		System.out.println("=============================");
		System.out.println(landi.info());
		System.out.println("=============================");
		System.out.println(mili.info());
		System.out.println("=============================");
		System.out.println(personnel.info());
		System.out.println(marketing.info());
	}

}
