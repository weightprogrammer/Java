package kosta_basic;

import java.util.Scanner;

public class if_ex02 {

	public static void main(String[] args) {
		int  score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("������ �Է����ּ���");
		Scanner sc=new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("����� ������ %d �Դϴ�", score);
		
		if(score >= 90) {
			grade ='A';
			if(score >= 98) {
				opt = '+';
			}else if (score < 94) {
				opt= '-';
			}
			System.out.printf("����� ������ %c%c�Դϴ�.%n", grade,opt);
		}

	}

}
