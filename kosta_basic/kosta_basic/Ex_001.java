package kosta_basic;

public class Ex_001 {

	public static void main(String[] args) {
		//������ 7���� ����� �迭�ȿ� �ʱ�ȭ �� ���
		
		int arr4[] = new int[9];
		for(int i =0;i< arr4.length; i++) {
			arr4[i] =7 *(i+1);
			System.out.println("7*" + (i+1)+ "=" + arr4[i]);
		}
	}

}
