package kosta.oop2;

public class Account {

	//����� ������ ���� (����=> ����)
	//���¹�ȣ,������,�ܾ�: ����(Ư�� => ��� ����(�ʵ�)
	private String accountNo;
	private String ownerName;
	private int balance;
	
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


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
