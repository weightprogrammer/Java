package review;

import java.util.Scanner;

public class do_while_ex01 {

	public static void main(String[] args) {
		// do-while ���� while �� �������� �ּ��� �ѹ��� ������ �ϰ� �Ѵ�.
		
//		do {
//			//���ǽ��� ������ ���϶� ����� ������� ���´�(ó�� �� ���� ������ ����)
//		} while (���ǽ�); 
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;//1 ~100������ ������ �� ����
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���");
			input = sc.nextInt();
			
			if(input > answer ) {
				System.out.println("down");
			}else if(input < answer) {
				System.out.println("UP");
			}
		}while(input!=answer);
		
		System.out.println("����");
	}
}
