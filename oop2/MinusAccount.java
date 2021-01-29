package kosta.oop2;

public class MinusAccount extends Account {

	private int creditLine;
	
//	public public MinusAccount() {}
	
	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}



	@Override
	public int withdraw(int amount) {
		if(getBalance()+ creditLine < amount) {
			return 0;
		}
		int n = getBalance();
		setBalance(n - amount);
		
		return amount;
	}
	
	//���̳ʽ� �ѵ��� ���� �ݾ� ����
	
	
}
