package kosta.mission;

import java.util.Scanner;

public class Mission08 {
	//�迭 ��� ������
// 1. �迭�� ���� ������ Ÿ���� �����ΰ�?    ����  ������ Ÿ���� �ϳ��� �����ϴ�
// 2. �迭�� ũ�� �� ���� (10������ 20������)-> �ʰ���� -> ArrayIndexOut... ������ ���´�
//									  ���� ũ�Ⱑ �ѹ� ������ �ٲܼ��� ����
// 3. �迭�� ��� �ʱ�ȭ �Ұ�����(���� �ε���,for,������ ���ÿ�ó��)
// 4. �迭�� �ִ� ������ ���(for��,���� for��)
	
	//������ ���ϴ� �޼��� 
	public static void total(int arr[]) {
		for(int i=0;i<3;i++) {
			arr[3] += arr[i];
		}
	}
	//������ ���ϴ� �޼���
	public static void average(int arr[]) {
		arr[4] += arr[3]/3;
		
	}
	//����ϴ� �޼���
	public static void print(int arr[]) {
		System.out.println("����\t����\t����\t����\t���");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		// ���� ���� ���� ������ �Է��϶�
		// ������ ����� ����϶�
		//��� ������ �迭�� �̿��Ͽ� �����϶�
		
		Scanner sc =new Scanner(System.in);
		int arr[] = new int [5];
		for(int i=0;i<3;i++) {
			System.out.println("�Է�:");
			arr[i] = sc.nextInt();
//			arr[3] += arr[i];
		}
		total(arr);
		average(arr);
		print(arr);
		
//		arr[4] = arr[3]/3;
//		System.out.println("����\t����\t����\t����\t���");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+"\t");
//		}
		
	}

}
