package review;

public class Nesting_for_ex02 {

	public static void main(String[] args) {
		// �ﰢ������ ���� ���� ����� ����
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
