package kosta.oop;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("start");
		Rectangle r1 = new Rectangle(sc.nextInt(),sc.nextInt()); //new ��ü�� �����ɶ� �ڵ����� �����ȴ�.
		Rectangle r2 = new Rectangle(sc.nextInt(),sc.nextInt());
		
//		System.out.println("����:");
//		r1.w =sc.nextInt();
//		
//		System.out.println("����");
//		r1.h = sc.nextInt();
		
		r1.area();
		r1.print();
		r2.area();
		r2.print();
	}

}
