package review;

import java.util.Scanner;

public class Loop_ex2 {

	public static void main(String[] args) {
		// ���� �ֹ� ����
		int menu = 0, num = 0;
		Scanner sc =new Scanner(System.in);
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�����ϼ���(����:0)");
			
			String tmp = sc.nextLine(); //ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷��� ����");
				break;
			}else if (!(1<= menu && menu <=3)) {
				System.out.println("�޴��� �߸� �����Ͽ����ϴ�(����� 0)");
				continue;
			}
			for(;;) {
				System.out.print("����� ���� �Ϸ��ϼ��� (�������:0,��ü���� :99");
				tmp = sc.nextLine(); //ȭ�鿡�� �Է¹��� ������ tmp�� ����
				menu = Integer.parseInt(tmp);
				
				if(num == 0) 
					break;
					
					if(num == 99)
						break outer;
				
					switch(menu) {
					case 1:
						System.out.println("result=" +num*num);
						break;
					case 2:
						System.out.println("result=" + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result=" + Math.log(num));
						break;
					}
				}
			}
		}

	}


