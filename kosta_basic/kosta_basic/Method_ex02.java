package kosta_basic;

public class Method_ex02 {
	

	public static void main(String[] args) {
		//�޼��带 �̿��Ͽ� �ι迭�� ������ ������ ��ġ�ϴ��� üũ
		int num1[] = {1,2,3,4,5};
		int num2[] = {1,2,3,4,5};
	
		if(equals(num1,num2)) {
			System.out.println("��ġ");
		}else {
			System.out.println("����ġ");
		}
		//�޼��� �̸�
	}

	private static boolean equals(int[] num1, int[] num2) {
		if(num1.length != num2.length) {
			return false;
		}
		for(int i=0;i<num1.length;i++) {
			if(num1[i] != num2[i]) {
				return false;
			}
		}
		return true;
	}
}