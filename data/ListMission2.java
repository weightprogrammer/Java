package kosta.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListMission2 {
	public static void main(String[] args) {
		//1. �迭
		Random r = new Random();
//		int arr[] = new int [6];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = r.nextInt(45) + 1;
//			for(int j =0;j<i;) {
//				if(arr[i] == arr[j]) {
//					i = i-1;
//				}
//			}
//		
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		//2. List
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r.nextInt(45)+1;
//			if(list.contains(n)) {
//				continue;
//			}else {
//				list.add(n);
//			}
//			if(list.size() == 6) break;
//		}
//		
//		for(int n : list) {
//			System.out.print(n + ", ");
//		}
		
		//3. set
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;set.size()<6;i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//45���� ���� �����
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		for(int i = 1; i <= 45; i++) {
//			numbers.add(i); // 1~45
//		}
//		//���´�
//		Collections.shuffle(numbers);
//		//�̴´�
//		int[] picked = new int[6];
//		for (int i = 0; i < 6; i++) { //numbers�� �� 6�� ���ڸ� ������
//			picked[i] = numbers.get(i);
//		}
//		//������
//		System.out.printf("�ڵ� ���� ��ȣ: %s", Arrays.toString(picked));
	}										//�迭�� �̻ڰ� ���ڿ��� �ٲ��ִ� �޼ҵ�
	
}
