package kosta_basic;

public class VariableExam {
	static int num2;
	
	public static void main(String[] args) {
		//���� ���� , ����ϱ� ���� ���� ����
		// 1. �������� ����(����) => ������ Ÿ�� ����
		// 2. �������� Ȱ�� ���� => ���� ���� ��ġ ����
		
		//��������(���ú���) : �޼��忡�� ����� ����
		int num1; //������ ���� => �޸� �Ҵ�
		int num2 = 0;
		num1 =10; //������ �ʱ�ȭ => ���� �Ҵ�
		System.out.println(num1);
		System.out.println(num2);
		
		//������ ����� ��ġ(scope) �ſ� �߿��ϴ�.
		int num3 = 100;
		
		if(num1 == 10 ) {
			//int num3 = 100;  ���� ���� : ��ȿ����: if{} 
			//������ ����� ��ġ�� �߿��ϴ�  ��ȿ������ �ٸ��� ������ �ſ� �߿��ϴ�.
			num3 = num3 +100;
		}
		System.out.println(num3);
		
	}
}
