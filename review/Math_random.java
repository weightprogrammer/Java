package review;

public class Math_random {

	public static void main(String[] args) {
		// ���� �� ��� ���ؼ��� Math.random() �� ����ؾ� �ϴµ�
		//�� �޼���� 0.0��1.0������ ������ ���ϴ� �ϳ��� double���� ��ȯ�Ѵ�.
		//0.0�� ������ ���Եǰ� 1.0�� ���c���� �ʴ´�.

		//0.0 <= Math.random() < 1.0
		
		int num = 0;
		
		//��ȣ {} ���� ������ 5�� �ݺ��Ѵ�
		for (int i =1; i<=5; i++) {
			num = (int) (Math.random() *6) +1;
			System.out.println(num);
		}
		
	}

}
