package kosta.oop;

public class Rectangle {
	//����, ���� ���� ���ؼ� ������ ���ϴ� ���α׷�������
	//����:
	
	int w; //0�� �� �ʿ䰡 ���� �̹� �ʱ�ȭ ����
	int h;
	int e;
	//�ൿ(���): ���� ���ϱ�
	public Rectangle() {}
	
	
	
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}



	public void area() {
		 e = w*h;
	}
	
	public void print () {
		System.out.println("���� �� ������=" + e);
		
	}
	
	
}
