package JavaEx;

import java.util.Scanner;

public class java_ex010 {

	public static void main(String[] args) {
//		���� 10
//		����(integer) �� ���� �Է¹޾� �״�� ����غ���.
//
//		�Է�
//		�� ���� ������ ���ʴ�� �Էµȴ�.
//
//		���
//		�Է¹��� �� ������ �������� �����Ͽ� �״�� ����Ѵ�.
//
//		�Է� ���� 
//		1
//
//		2
//
//		��� ����
//		1 2
//		����
//
//		Scanner Ŭ������ ����ϸ� �ȴ�. nextInt() �޼ҵ� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �����Է�");
		int num = sc.nextInt();
		System.out.println("�ι�° �����Է�");
		int sum = sc.nextInt();
		
		System.out.println(num + " " + sum);
	}

}
