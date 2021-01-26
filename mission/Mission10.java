package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;

public class Mission10 {

	public static void main(String[] args) {
		//2�������� ��������� ����
		//����,����,���� ���� �Է� => ����,���
		//2�� �̻��� ������ �Է� ���� => 2���� �迭
		//���� ���� ���� ���� ���
		//��ü ���
		
		int[][] score = {{100,80,55},{50,100,90},{40,60,70}};
		
		Arrays.sort(score, new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {
				if(o1[0] > o2[0]) {
					return -1;
				}else if(o1[0]<o2[0]) {
					return 1;
				}else {
				return 0;
			}
		}
		});
		for(int i=0; i< score.length;i++) {
			for(int j=0;j<2; j++) {
				System.out.print(score[i][j] + ",");
			}
			System.out.println();
		}
		
		int korTotal = 0 , engTotal =0 , matTotal =0;
		
		System.out.println("��ȣ  ����     ����    ����   ����   ���");
		System.out.println("===========================");
		
		for(int i =0; i< score.length; i++) {
			int sum = 0; //������ ���� ����
			float aver = 0.0f; //��տ� ���� ����
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			System.out.printf("%d" , i+1);
			
			for(int j=0; j< score[i].length;j++) {
				sum += score[i][j];
				System.out.printf("%5d" , score[i][j]);
			}
			
			aver = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum , aver);
		}
	}
}