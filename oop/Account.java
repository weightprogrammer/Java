package kosta.oop;

public class Account {

	//����� ������ ���� (����=> ����)
	//���¹�ȣ,������,�ܾ�: ����(Ư�� => ��� ����(�ʵ�)
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {}
	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}


												//�޼ҵ� ���鶧 �߿伺 : 1. ���ϰ��� �ʿ��Ѱ�? 2. �Ķ���Ͱ� ���� �ִ���?
	//����� ��� :�ൿ(���) = > ��� �޼��� (���۷��̼�)
	//�Ա�,��� ,������� ���
	public void deposit(int amount) {
		balance += amount;
	}
	public int withdraw(int amount) {
		if (balance < amount) {
			return 0 ;
		}
		balance -= amount;
		
		return amount;
	}
	
	
	public void print () {
		System.out.println("���¹�ȣ " + accountNo);
		System.out.println("������ " + ownerName);
		System.out.println("�ܾ� " + balance);
	}
}
