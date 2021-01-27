package kosta.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1.�߰� 2.��ü�˻� 3.�˻� 4.����
		//Scanner sc = new Scanner(System.in);
		
		//��ü ����
		Manager m = new Manager();		
		
		//��, ������ �Ǻ��ϱ� ���� while(true) �� ���
		while(true) {
			System.out.println("1.�߰� 2.��ü�˻� 3.�˻� 4.���� 5.���� 6.����");
			System.out.println("����:");
			String menu =  DateInput.sc.nextLine();
			
			//switch ������ �ش� �޼ҵ� ȣ��
			switch (menu) {
			case "1":
				try {
					m.addPhoneInfo();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.change();
				break;
			case "5":
				m.delete();
				break;
			case "6":
				System.out.println("���� �մϴ�.");
				
				return;

			default:
				break;
			}
		}

	}

}
