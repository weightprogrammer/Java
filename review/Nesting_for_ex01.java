package review;

public class Nesting_for_ex01 {

	public static void main(String[] args) {
		// for�� �ȿ� �� �ٸ� for���� ���Խ�Ű�� ���� ����
		
		// �̷� �ٺ����� �������� for ���� �Ẹ��
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
		//for ��
		for(int i=1;i<=5;i++) {
			System.out.println("*****");
		}
		
		//��ø for ��
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
