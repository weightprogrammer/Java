package kosta.Thread;

public class Main1 {

	public static void main(String[] args) {
		Manger m = new Manger();
		
		Baker b1 = new  Baker("��Ź��" , m);
		Baker b2 = new  Baker("��Ź��" , m);
		Baker b3 = new  Baker("��Ź��" , m);
		
		
		Customer c1 = new Customer("��Һ�", m);
		Customer c2 = new Customer("�̼Һ�", m);
		Customer c3 = new Customer("�ڼҺ�", m);
		
		b1.start();
		b2.start();
		b3.start();
		
		for(int i = 0; i<1000000;i++ ) {}
		
		c1.start();
		c2.start();
		c3.start();
	}

}
