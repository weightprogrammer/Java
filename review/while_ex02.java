package review;

public class while_ex02 {

	public static void main(String[] args) {
		// ���� i����ŭ ��{} �ݺ��غ��� while ������...
		// 1���� ����� ���ؾ� 100�� ���� �ʴ� �� �˾Ƴ���
		
		int sum =0;
		int i = 0; //i�� 1�� �������Ѽ� sum�� ���Ѵ�
		
		while(sum<=100) {
			System.out.printf("%d  -  %d%n" , i, sum);
			sum += ++i;
		}
		
		
		
//		int i =5;
//		
//		while(i!=0) {
//			i--;
//			System.out.println(i +"I can do it");
//		}

	}

}
