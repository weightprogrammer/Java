package kosta.oop;



public class AccountMain {

	public static void main(String[] args) {
		Account account1; // ���۷���  ������ ���� (���� ������ ��ü�� �ּҸ� �����ϱ� ���� ����)
		//�ν��Ͻ�ȭ(��ü����)		// new �����ڿ� ���� ��ü ���� ����
		
		
		
		Account arr[] = {
				new Account("1111-3333","ȫ�浿",10000),
				new Account("2222-2222","�ڱ浿",40000)
		};
		
		for(Account account :arr) {
			account.deposit(5000);
			account.print();
		}
//		account1 = new Account("1111-3333","ȫ�浿",10000);  // ���ο� ��ü�� ����(�޸� �Ҵ�) = account���� :  �ּҰ��� ���´�!!(�ν��Ͻ� ����:��ü)!(�߿�)
//		account1 = new Account("2222-2222","�ڱ浿",40000);  // ���ο� ��ü�� ����(�޸� �Ҵ�) = account���� :  �ּҰ��� ���´�!!(�ν��Ͻ� ����:��ü)!(�߿�)
		//��ü�� �ʱ�ȭ
//		account1.accountNo = "1111-1233";
//		account1.ownerName = "�����";
//		account1.balance=100000000;
		//��ü �޼��� ȣ��
//		account1.deposit(70000000);
//		account1.print();
		
		//�����ϱ� �޼��带 ���ؼ� ����ݾ�, �ܾ��� ������ ����Ͻÿ�.
//		int re = Account.withdraw(30000);
		
//		System.out.println("����ݾ�:" +re );
//		System.out.println("�ܾ�" + account1.balance );
		
		
		
	}

}
