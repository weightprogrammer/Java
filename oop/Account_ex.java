package kosta.oop;

public class Account_ex {

	public static void main(String[] args) {
		Tv t;								//Tv �ν��Ͻ��� �����ϱ� ���� ���� t �� ����
		t = new Tv();						//Tv �ν��Ͻ��� �����Ѵ�.
		t.channel = 7;						//Tv �ν��Ͻ��� ������� channel�� ���� 7���Ѵ�.
		t.channelDown();					//Tv �ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
//		System.out.println("���� ä����") + t.channel + "�Դϴ�.";
	}
}

class Tv {
	//Tv �� �Ӽ�(�������)
	String color;			// ����
	boolean power;			// �������� (on/off)
	int channel;			// ä��
	
	void power() {power =!power;}	//Tv�� �Ѱų� ���� ����� �޼���
	void channeUP() {++channel;}	//Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;} //Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}