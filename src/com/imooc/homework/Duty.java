package com.imooc.homework;

public class Duty {
	//��Ա����  ְ���š�ְ������
	private String dutyNo;	//ְ����
	private String dutyName;	//ְ������

	// �޲ι��캯��
	public Duty() {

	}
	/**
	 * ���ι���  ʵ�ֶ�ְ���š�ְ�����Ƹ�ֵ
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
