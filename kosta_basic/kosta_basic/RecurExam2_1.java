package kosta_basic;

import java.util.Scanner;

public class RecurExam2_1 {
	
	public static int recur(int n) {
		if(n==0) {
			return 0; //
		}else {
			return n + recur(n+1);
		}
	}
	
	public static int recur2(int n, int arr[] ) {
		if(n<=0 || n >= arr.length) {
			return 0;
		}else {
			return arr[n] +recur2(n+1, arr);
		}
	}
	public static void main(String[] args) {
		// 0 ~ n ������ �հ踦 ���ϼ��� => ��� �Լ�   /0���� ��� ���Ѵ�
		Scanner sc =new Scanner(System.in);
		System.out.print("�Է�? ");
		int n = sc.nextInt();
		
//		System.out.println( "," + f(n));
		
		int[] arr= {10,20,30,40};
		System.out.println(recur2(n-1 , arr));
	
		//n ~ arr[n-1] ������ ���� ���϶�. ����Լ���
		
	}

}
