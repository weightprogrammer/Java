package kosta.studnt;


public class Student_Idcard {   

	String name;// �̸�

	String studentNo; //�й�	

	int score[] = new int[4]; // ���� �迭	

	

	Student_Idcard(String name, String studentNo, int score[]){ // ������

	this.name = name;

	this.studentNo = studentNo;

	this.score= score;

	}	



	Student_Idcard(String name, String studentNo){ 

	// testExample1���� ������ input���� �����Ƿ� 2���� �ҷ����� ������

	this.name = name;

	this.studentNo = studentNo;	

	}	

}






