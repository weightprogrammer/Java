package kosta_basic;

import java.util.Scanner;

public class if_Ex {

	public static void main(String[] args) {
		int score =0;
		char grade = ' ';
		System.out.println("������ �Է��ض�");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >=90) {
			grade = 'A';
		}else if (80 <= score && score <90) {
			grade = 'B';
		}else if (score >=70) {
			grade = 'c';
		}else if (score >=40) {
			grade = 'd';
		}else {
			grade ='f';
		}
		System.out.println("����������� " + grade +"�Դϴ�.");
	}

}
//public static void main(String[] args) {
//	System.out.println("���ڸ� �Է��ϼ���.");
//	Scanner sc = new Scanner(System.in);
//	int input = sc.nextInt();
//	
//	if(input==0) {
//		System.out.println("�Է��� ���ڴ� 0�Դϴ�");
//	}else {
//		System.out.println("�Է��� ���ڴ� 0�� �ƴ�");
//int x = 0;
//System.out.printf("x=%d �϶�, ���� ����%n", x);
//
//if(x==0) System.out.println("x==0");
//if(x!=0) System.out.println("x!=0");
//if(!(x==0)) System.out.println("!(x==0)");
//if(!(x!=0)) System.out.println("!(x!=0)");
//
//x =1;
//System.out.printf("x=%d �϶�, ���� ����%n", x);
//if(x==0) System.out.println("x==0");
//if(x!=0) System.out.println("x!=0");
//if(!(x==0)) System.out.println("!(x==0)");
//if(!(x!=0)) System.out.println("!(x!=0)");
