package kosta_basic;

import java.util.Arrays;

public class Arr2_ex01 {

	public static void main(String[] args) {
		int arr[][];;// 2���� �迭 ���� �迭�� ����ų�� �մ� ������ ���� 
		arr =new int[3][2]; //������ ���� arr[0][0]
		
		//1 ���� �迭�� ũ�⸦ �����ϰ� ����
		int arr2[][] = new int[3][];
		arr2[0] = new int [2];
		arr2[1] = new int [3];
		arr2[2] = new int [4];
		
		//2���� �迭 �����ϰ� �����ϸ鼭 �ʱ�ȭ ���� �ϴ¹��
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}};
		//2 ���� �迭�� ��ø for���� ����ؼ� �ڵ带 §��.
//		for(int i=0;i<arr3.length;i++) {
//			arr3 = new int [4][3];
//			
//			System.out.println(i);
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.println("arr3["+ i+ "]["+j+"]=" + arr3[i][j]);
			}
			
		}
		//�迭 ����  �ϴ�����? �迭�� ũ��� ������ �Ұ��� �ϱ� ������
		String oldArr[]= new String[3];
		oldArr[0]= "10";
		oldArr[1]= "20";
		
		String newArr[] = new String[2];
		
		System.arraycopy(oldArr, 0,newArr,0,newArr.length);	
		System.out.println(Arrays.toString(newArr));
		int num = Integer.parseInt(oldArr[2]);
		System.out.println(num);
	}

}
