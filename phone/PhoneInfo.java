package kosta.phone;

import java.util.Scanner;

public class PhoneInfo {
	//��� ���� ����
	//��� �޼��� ����
	
	Scanner sc= new Scanner(System.in);
	
	 String name;
	 String phoneNum;
	 String birth;
	
	//����Ʈ ����
	public PhoneInfo() {}
	
	//������ ����
	public PhoneInfo(String name, String phoneNum, String birth) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}
	
	
	//��� �޼ҵ� ����
	public void show() {
		System.out.println("�̸� : " + name + "\t\t" +"��ȭ��ȣ : " + phoneNum + "\t" +"������� :" + birth);
	}
}
