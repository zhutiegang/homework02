package com.imooc.homework;

public class Test {

	public static void main(String[] args) {
		Department personnel=new Department("D01","���²�");
		Department marketing=new Department("D02","�г���");
		Duty manager=new Duty("Z01","����");
		Duty assistant=new Duty("Z02","����");
		Employee zhangming=new Employee("����","S001",29,"��",personnel,manager);
		Employee liaiai=new Employee("���","S002",21,"Ů",personnel,assistant);
		System.out.println(zhangming.info());
		System.out.println("=============================");
		System.out.println(liaiai.info());
		System.out.println("=============================");
		System.out.println(personnel.getDepartmentName()+"�ܹ���"+personnel.getMyEmployeesNum()+"��Ա��");
		System.out.println(marketing.getDepartmentName()+"�ܹ���"+marketing.getMyEmployeesNum()+"��Ա��");
	}

}
