package kosta.studnt;

import java.util.Scanner;

public class StudentInfo extends Student_Idcard {

	// �л� �̸�, �й�, ������ ����Ŭ�������� ���

	char grade[] = new char[4]; // ���� �迭

	int total, average; // ����, ���



	StudentInfo(String name, String studentNo, int score[]) {

		super(name, studentNo, score); // ����Ŭ������ ������ ���

	}

	StudentInfo(String name, String studentNo) {

		super(name, studentNo); // ����Ŭ������ ������ ���

	}



	void input() { // ��������, �������� �Է� �޼ҵ�

		Scanner in = new Scanner(System.in);

		System.out.printf("��������:");

		score[0] = in.nextInt();

		System.out.printf("��������:");

		score[1] = in.nextInt();

		System.out.printf("��������:");

		score[2] = in.nextInt();

		System.out.printf("��������:");

		score[3] = in.nextInt();

	}

//	void Getgrade() {	 // ���� ��� �޼ҵ�
//
//		for(int i=0;i<score.length;i++) {
//
//		if( score[i] >= 90 ) grade[i] = 'A';
//
//		else if( score[i] >= 80 ) grade[i] = 'B';
//
//		else if( score[i] >= 70 ) grade[i] = 'C';
//
//		else if( score[i] >= 60 ) grade[i] = 'D';
//
//		else grade[i] = 'F';
//
//		// if�� ����� �迭������ ������� �����Ƿ� return ���� ��� ��
//
//		}		
//
//	}

	

	int getTotal() { // ���� ��� �޼ҵ�

		for (int i = 0; i < score.length; i++)

			total += score[i];

		return total;

	}

	int getAverage() { // ��� ��� �޼ҵ�

		average = total / score.length;

		return average;

	}



	void prn() { // ��� �޼ҵ�

//		Getgrade(); // �޼ҵ�� �̷��� ȣ�������� ������ �۵� ����!!

		getTotal(); 

		getAverage();

		System.out.println("�̸�:" + name);

		System.out.println("�й�:" + studentNo);

		System.out.println("��������:" + score[0] );

		System.out.println("��������:" + score[1] );

		System.out.println("��������:" + score[1] );

		System.out.println("��������:" + score[1] );

		System.out.println("����:" + total + " ���=" + average);

	}

}




