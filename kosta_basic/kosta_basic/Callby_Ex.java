package kosta_basic;

public class Callby_Ex {
//�޼��� ���� �Ķ���� ���� ������ �־ �ٲ��� �ʴ´�.
	public static void change(int num) {
		num+= 100;
		
		//return num;
	}
	public static void change2(int arr[]) {
		arr[0] += 20;
	}
	
	public static void main(String[] args) {
	//CallByValue: ���� ���� ȣ��
		int num =50;
		int arr[] = {10};
		
		//CallByValue: ���� ���� ȣ��
		change(num);
		//CallByReference : �ּҰ��� ���� ȣ��  ||�ſ� �߿��ϴ� �� �������� 
							//������ ��ü�� �� ���۷��������� �ּҰ��� �ִ� ������ �����ϴ�.
		change2(arr);
		
		//System.out.println(num);
		System.out.println(arr[0]);
	}

}
