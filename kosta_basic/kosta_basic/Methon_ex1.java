package kosta_basic;

public class Methon_ex1 {
	//�޼���� �ߺ��� �ڵ带 �������� �����.
	//�޼��� ����
	// ���������� - ������ - �޼�Ʈ �̸�(�Ķ����){
	//      �޼ҵ� ����
	//}
	
	static void printCharacter(char ch,int num) {
		for(int i=1;i<=num;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static int add(int n1, int n2) {
		int sum =0;
		sum = n1 + n2;  //������ Ÿ���� ��ġ�ؾ��Ѵ�.
		
		return sum;
	}
	
	public static void main(String[] args) {
		printCharacter('*', 20); //�޼��� ȣ��
		
		System.out.println("Hello");
		
		printCharacter('#', 15);
		printCharacter('A', 2);
		
		int n1 = 10;
		int n2 = 20;
		
		int re = add(n1, n2);
		System.out.println(re);
	}

}
