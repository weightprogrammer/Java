package kosta.mission;

import java.util.Scanner;

public class Mission9_1 {
	// �޴��� �����ؼ� �ش� �޴��� ����� �����غ���.
			//1�� �߰� 2.���3.�˻�4.���� ����ġ
			//string �迭 ����
			//�Է� :1 �� �ϸ�
			//�迭�� ������ �߰�
			//�Է� :2 ���ϸ�
			//�迭�� �ִ� �����Ͱ� ���
			//�Է� :3 ���ϸ�
			//�ش� ���ڿ��� �ε����� ���
			//�Է� :4��
			//return;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String strr[] =new String[10];
		int count = 0;
		
		
		while(true) {
			System.out.println("1�� �߰� 2.���3.�˻�4.����");
			System.out.print("�޴��Է�:");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.println("���ڿ��Է�:");
				String str =sc.nextLine();
				strr[count++] = str;
				break;
			case "2":
				for(int i =0; i<count;i++) {
					System.out.println(strr[i]);
				}
				break;
			case "3":
				System.out.print("�˻� �Է�:");
				String search = sc.nextLine();
				int idex = -1;
				for (int i =0; i<count;i++) {
					if(strr[i].equals(search)) {
						idex =i;
						break;
					}
				}
				System.out.println(idex + " ���� �Դϴ�.");
				break;
			case "4":
				System.out.println("���α׷� ����");
				return;

			default:
				break;
			}
		}
		
	}
}