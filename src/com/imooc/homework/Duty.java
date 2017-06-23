package com.imooc.homework;

public class Duty {
	//成员属性  职务编号、职务名称
	private String dutyNo;	//职务编号
	private String dutyName;	//职务名称

	// 无参构造函数
	public Duty() {

	}
	/**
	 * 带参构造  实现对职务编号、职务名称赋值
	 * @param dutyNo
	 * @param dutyName
	 */
	public Duty(String dutyNo, String dutyName) {
		this.setDutyNo(dutyNo);
		this.setDutyName(dutyName);
	}

	public String getDutyNo() {
		return dutyNo;
	}

	public void setDutyNo(String dutyNo) {
		this.dutyNo = dutyNo;
	}

	public String getDutyName() {
		return dutyName;
	}

	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}

}
