package kosta.mission;

import java.util.Scanner;

public class Mission06 {
	//2���� ������ �Է¹޾� b - a ����� �������
	//b > a �� �ǵ��� �Է¹���
	//1. do ~while �Է¹ޱ�
	//2. while => break;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a�Է�:");// ���
		int a = sc.nextInt(); //����� a
		int b = 0;
		
//		for(;;) for�� ���ѹݺ� ���
		
		while(true) {
			System.out.println("b�Է�:");
			b = sc.nextInt();
			if(b > a) break;
		}
//		do {
//			System.out.println("b�Է�:");
//			b = sc.nextInt();
//		}while(a>=b);
//		
		System.out.println("b - a =" + (b-a));
	}

}
