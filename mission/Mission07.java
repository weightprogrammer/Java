package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		//UP/down game
		//���� ������ ����:1~100 ���Ǽ��� ����
		//Ű����κ��� ���ڸ� �Է�
		//�Է��� ���ڿ� ������ ������ ��
		//����,up,down =>�޼��� ���
		//�� ���õ��ߴ��� �� ���
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int re = r.nextInt(100);
		int count = 0;
		int n;
		
		System.out.println(re);
		while(true) {
			do {
				System.out.println("1 ~ 100�Է�:");
				n = sc.nextInt();
			}while(n> 100);
			count++;
			if(re==n) {
				System.out.println(count + "��° ����!");
				break;
			}else if(re < n) {
				System.out.println("Donw");
			}else if(re > n) {
				System.out.println("UP!!");
			}
		}
	}
}
//		int  input = 0, answer =0, count =0;
//		answer =(int) (Math.random() * 100) + 1;
//		Scanner sc =new Scanner(System.in);
//		do {
//			count ++;
//			System.out.println("1 ~ 100 ���� �� ������� ��������");
//			input = sc.nextInt();
//			
//			if(input > answer) {
//				System.out.println("down");
//			}else if(input < answer) {
//				System.out.println("up");
//			}
//		}while(input!=answer);
//		System.out.println("����");
//		System.out.println("�����õ���?" + count);
//		}
//	}

