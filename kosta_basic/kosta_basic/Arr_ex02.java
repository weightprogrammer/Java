package kosta_basic;

import java.util.Scanner;

public class Arr_ex02 {
	//�迭 ��� ������
	// 1. �迭�� ���� ������ Ÿ���� �����ΰ�?    ����  ������ Ÿ���� �ϳ��� �����ϴ�
	// 2. �迭�� ũ�� �� ���� (10������ 20������)-> �ʰ���� -> ArrayIndexOut... ������ ���´�
	//									  ���� ũ�Ⱑ �ѹ� ������ �ٲܼ��� ����
	// 3. �迭�� ��� �ʱ�ȭ �Ұ�����(���� �ε���,for,������ ���ÿ�ó��)
	// 4. �迭�� �ִ� ������ ���(for��,���� for��)
	public static void main(String[] args) {
		// ���ڿ� �迭 ���� �� Ű����� ���� �����͸� �ʱ�ȭ =>q ���ڸ� �Է� �ɶ�����
		// nextLine(): Ű���� ���� �����Է�
		// �迭 ��ü ������ ���
		
		
		Scanner sc = new Scanner(System.in);
		String sArr[] =new String[10];
		int count =0;
		
		while(true) {
			System.out.println("�Է�:");
			String str =sc.nextLine();
			if(str.equals("q")) break;// "q" �� ���ö� �극��ũ ���ش�.
			sArr[count++] = str;  
			//������� ������ ������ ī��Ʈ�� �ٲ��ְ� ��� �����Ҽ� �ֵ��� ++�ִ´�.
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(sArr[i]);
		}
		
		
		
		
		
		
		
//		String [] names = {"a", "b", "q"};
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i=0; i < names.length;i++)
//		System.out.println("names["+i+"]:" + names[i]);
//		
//		String tmp =names[2];
//		System.out.println("tmp:" + tmp);
//		names[0] = 

	}

}
