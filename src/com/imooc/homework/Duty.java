package com.imooc.homework;

public class Duty {
	private String dutyNo;
	private String dutyName;

	// 无参构造函数
	public Duty() {

	}

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
