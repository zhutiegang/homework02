package com.imooc.homework;

public class Test {

	public static void main(String[] args) {
		//����
		Department personnel=new Department("D01","���²�");
		Department marketing=new Department("D02","�г���");
		//ְ��
		Duty manager=new Duty("Z01","����");
		Duty assistant=new Duty("Z02","����");
		Duty clerk=new Duty("Z03","ְԱ");
		//��Ա��ȫ�����Ը�ֵ
		Employee zhangming=new Employee("����","S001",29,"��",personnel,manager);
		Employee liaiai=new Employee("���","S002",21,"Ů",personnel,assistant);
		Employee sunchao=new Employee("�ﳬ","S004",29,"��",personnel,clerk);
		Employee zhangmeimei=new Employee("������","S005",26,"Ů",marketing,clerk);
		Employee landi=new Employee("����","S006",37,"��",marketing,manager);
		//ֻ��Ա�����������š����䡢�Ա�ֵ
		Employee mili=new Employee("����","s007",24,"Ů");
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
