package kosta_basic;

import java.util.Scanner;

public class Test_sc_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�1");
		sc.nextInt();
		System.out.print("�����Է�2");
		sc.nextInt();
		
		System.out.print("�����Է�");
		sc.nextLine();
		String a = sc.nextLine();
		System.out.println(a);
		System.out.println("done");
	}

}
