package review;

import java.util.Scanner;

public class Ifelse_ex02 {

	public static void main(String[] args) {
		int score = 0; //������ �����ϱ� ���� ����
		char grade = ' '; //������ �����ϱ� ���� ����.�������� �ʱ�ȭ

		System.out.println("������ �Է��ض�");
		Scanner sc = new Scanner(System.in);
		score = sc .nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score �� ����
		
		if (score >= 90) { //score�� 90�� ���� ���ų� ũ�� A�����̴�.
			grade = 'A';
		}else if (score >= 80) { //score�� 80�� ���� ���ų� ũ�� B�����̴�.
			grade = 'B';		 // 80 <= score < 90
		}else if (score >= 70) { //score�� 70�� ���� ���ų� ũ�� C�����̴�.
			grade = 'C';	     // 70 <= score < 80
		}else {
			grade = 'D';
		}
		System.out.println("������" + grade +"�Դϴ�.");
	}

}
