package kosta.oop;

public class Book {
	//���� : å�̸�, ����, ���ε� ����
	//���: ���ΰ��� ����, å�� ���� ���� ���
	String bkn;
	int sail;
	int dc;
	
	public Book () {}

	public Book(String bkn, int sail) {
		super();
		this.bkn = bkn;
		this.sail = sail;
	}
	public void discount() {
		if(sail >= 30000) {
			dc = (int)(sail*0.75); //int������ ����ȯ
		}else if(sail >= 25000) {
			dc = (int)(sail*0.80);
		}else if(sail >= 15000){
			dc = (int)(sail*0.85);
		}
	}
	public void print() {
		System.out.println(bkn + "�� ������ " + sail + "���ε� ������ " + dc +"�� �Դϴ�.");
	}
	
	
}

	
