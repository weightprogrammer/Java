package kosta.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// Ű����� ���� ���ڸ� �Է¹޾� ���� ������
		//������ �Է��ϸ� ���Ӱ� �ٽ� �Է� �޵�������
//		int sum = 0;
//		int num = 0;
//	    Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        do {
//        	System.out.print(sum + num);
//        	sum++;
//        }while (sum < 10);
//        System.out.print("�հ�:" + sum +num);
		Scanner sc = new Scanner(System.in);
		int n =0;
		do {
			System.out.println("�Է�:");
			n =sc.nextInt();
		} while (n <= 0);
		int sum = 0;
		int i = 1;
		while (i<=n) {
			sum +=i;
			i++;
		}
        System.out.println("1����" + n + "������ ��:" + sum);
	}
}
