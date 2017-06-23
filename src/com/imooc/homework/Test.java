package com.imooc.homework;

public class Test {

	public static void main(String[] args) {
		Department personnel=new Department("D01","人事部");
		Department marketing=new Department("D02","市场部");
		Duty manager=new Duty("Z01","经理");
		Duty assistant=new Duty("Z02","助理");
		Employee zhangming=new Employee("张铭","S001",29,"男",personnel,manager);
		Employee liaiai=new Employee("李艾爱","S002",21,"女",personnel,assistant);
		System.out.println(zhangming.info());
		System.out.println("=============================");
		System.out.println(liaiai.info());
		System.out.println("=============================");
		System.out.println(personnel.getDepartmentName()+"总共有"+personnel.getMyEmployeesNum()+"名员工");
		System.out.println(marketing.getDepartmentName()+"总共有"+marketing.getMyEmployeesNum()+"名员工");
	}

}
