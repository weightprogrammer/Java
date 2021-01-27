package kosta.phone;

import java.util.Scanner;

public class Manager {
	

	//Scanner sc =new Scanner(System.in);
	int count = 0;
	
	PhoneInfo arr[];
	
	public Manager() {
		arr = new PhoneInfo[10];
	}
	
	public void addPhoneInfo()throws Exception {
		//�̸�, ��ȭ��ȣ, ������� �Է�
		System.out.print("�̸��� �Է� �ϼ��� :");
		String name = DateInput.sc.nextLine();
		System.out.print("�ڵ��� ��ȣ�� �Է��ϼ���");
		String phoneNum = DateInput.sc.nextLine();
		System.out.print("��������� �Է��ϼ���");
		String birth =DateInput.sc.nextLine();
		
		if(phoneNum ==null || phoneNum.length()==0) {
			throw new Exception("�ݵ�� ��ȭ��ȣ �Է��ϼ���");
		}
		
		arr[count++] = new PhoneInfo(name, phoneNum, birth);
		//PhoneInfo��ü���� => �迭�߰�
	}
	
	public void listPhoneInfo() {
		//�迭�� �ִ� PhoneInfo��ü ��θ� ���
		for (int i =0; i<count; i++) {
			arr[i].show();
		}
	}
	
	public void searchPhoneInfo() {
		//Ű����� ���� �̸� �Է� �޾�
		System.out.println("�˻��� �л��� �̸� : ");
		String name =DateInput.sc.nextLine();
		int index = -1;
		// �ش� PhoneInfo ��ü�� ���
		for (int i=0; i<=count - 1; i += 1 ) {
			if(name.equals(arr[i].name)) {
				index =i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}else {
			arr[index].show();
		}
	}
	//����
	public void change() {
		System.out.println("�˻��� �̸� :");
		String name = DateInput.sc.nextLine();
		int index = -1;
		
		for(int i=0; i<= count -1; i+= 1) {
			if((arr[i].name).equals(name)) {
				index = i;
				System.out.println("������ ��ȣ : ");
				String phoneNum = DateInput.sc.nextLine();
				arr[index].phoneNum = phoneNum;
				
				break;
			}
		}
		if (index == -1) {
			System.out.println("����� ã�� ���߽��ϴ�.");
		}else {
			System.out.println("���� �Ϸ�");
		}
	}
	//����
	public void delete() {
		System.out.println("�˻��� �̸� : ");
		String name =DateInput.sc.nextLine();
		int index = -1;
		
		for (int i=0; i<=count -1; i+=1) {
			if((arr[i].name).equals(name)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			for(int i =index; i < count; i +=1) {
				if (i !=arr.length) {
					arr[i] =arr[i + 1];
				}
			}
			arr[count -1] = null;
			count --;
		}else {
			System.out.println("ã���� �����ϴ�.");
		}
	}
}
