package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	// ������ ���ϴ� �޼���
	public static int total(int kor, int eng, int mat) {
		int sum =0;
		sum = kor + eng + mat;  //������ Ÿ���� ��ġ�ؾ��Ѵ�.
		return sum;
	}
	// ������ ���ϴ� �޼���
	public static int average(int total) {
		int average = total/3;
		 //������ Ÿ���� ��ġ�ؾ��Ѵ�.
		
		return average;
	}
	public static void main(String[] args) {
		// ����, ����, ���� ������ ���� �ް�
		//������ ����� ����϶�(����� �Ҽ����� ���)
		Scanner sc =new Scanner(System.in);
		
		int kor, eng, mat;
		
		int sum = 0;
		int aver = 0;
		
		System.out.println("����");
		kor = sc.nextInt();
		System.out.println("����");
		eng = sc.nextInt();
		System.out.println("����");
		mat = sc.nextInt();
		
		sum = total(kor, eng, mat);
		aver = average(sum);
		
		System.out.println("����" + sum);
		System.out.println("���" + aver);
		//if ���� ����ġ�� ������
		
		switch (aver/10) {
		case 9:
			System.out.println("A����");
			break;
		case 7:
			System.out.println("B����");
			break;
		case 5:
			System.out.println("C����");
			break;

		default :
			System.out.println("f�Դϴ�");
			break;
		}
//		if (aver >= 90) { 
//			System.out.println("A�� �Դϴ�.");
//		}else if (aver >= 80 ) {
//			System.out.println("����� ������ B�� �Դϴ�.");
//		}else if (aver >= 60 ) {
//			System.out.println("����� ������ C�� �Դϴ�.");
//		}
		
//		int kor = 8;
//		int math = 7;
//		int en = 5;
//		
//		System.out.println("����:"+kor);
//		System.out.println("����:"+ math);
//		System.out.println("����:"+ en);
//		System.out.println(kor + math + en);
//		System.out.println( kor + math + en /(double) 3);
//		System.out.println( kor + math + en);	
	}
}
