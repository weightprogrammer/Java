package review;

import java.util.Scanner;

public class break_continue_ex01 {

	public static void main(String[] args) {
		// �޴��� �����ְ� �����ϰ� �غ���
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ��� (����:0");
			
			String tmp = sc.nextLine(); // ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷� ����");
				break;
			}else if (!(1 <= menu && menu <=3)) {
				System.out.println("�޴��� �߸����׽��ϴ�");
				continue;
			}
			System.out.println("���ø޴�" + menu + "�Դϴ�.");
		}

	}

}
