package com.imooc.homework;

public class Department {
	//��Ա����
	private String departmentNo;	//���ű��
	private String departmentName;	//��������
	private Employee[] myEmployees;	//����Ա��
	private int myEmployeesNum;	//����Ա������
	/**
	 * �޲ι���
	 */
	public Department(){
		
	}
	/**
	 * ���ι��� ʵ�ֶԲ��ű�š��������Ƹ�ֵ
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
	 * �������Ա��
	 * @param employee Ա����ʵ��
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
	 * @return �ò���Ա����Ϣ
	 */
	public String info(){
		String str="";
		str+=this.getDepartmentName()+"�ܹ���"+this.getMyEmployeesNum()+"��Ա��";
		return str;
	}

}
