package kosta_basic;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. �迭����, �����и�
		
		int arr[]; //�迭 ���� => �ּҰ��� ������ �ִ� ������ ����
		arr = new int [5];  // �迭 ����(�������� �����͸� ���� �� �ִ� ���� ����)
							// ������ �ּҸ� arr�� ������ �ߴ�.
		
		// 2. �迭����, ���� ���� �ϴ� ���
		int arr2[]= new int [5];
		
		// 3. �迭����,����, �ʱ�ȭ �����ϴ� ���
		int arr3[] = {1,2,3,4,5};        //������ �迭�ȿ� �����ϰ� ���� �߰��Ѱ��
		//for ���� �̿��ؼ� ��ü �迭��Ҹ� �������
		//arr3[0] =1
		//arr3[1] =2
		//arr3[2] =3
		//arr3[3] =4
		//arr3[4] =5
		
//		for(int i=0;i < arr3.length; i++)

//		System.out.println("arr[" + i+ "]" + arr3[i]);	// �ε����� �ʿ���  ���
		
		//���� for ���� �̿��ؼ� �������
		for(int n :arr3) {
			System.out.print(n +","); //�迭�ȿ� �ִ� ���� �ʿ�� �Ѱ��
		}
		
		//�迭 ��� ������
		// 1. �迭�� ���� ������ Ÿ���� �����ΰ�?    ����  ������ Ÿ���� �ϳ��� �����ϴ�
		// 2. �迭�� ũ�� �� ���� (10������ 20������)-> �ʰ���� -> ArrayIndexOut... ������ ���´�
		//									  ���� ũ�Ⱑ �ѹ� ������ �ٲܼ��� ����
		// 3. �迭�� ��� �ʱ�ȭ �Ұ�����(���� �ε���,for,������ ���ÿ�ó��)
		// 4. �迭�� �ִ� ������ ���(for��,���� for��)
		
		//������ 7���� ����� �迭�ȿ� �ʱ�ȭ �� ���
		
//		int[] arr = new int[8];
//		for(int i;i<=0;i++)
 }
}