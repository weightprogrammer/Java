package kosta_basic;

import java.util.Scanner;

public class Arr2_ex3 {

	public static void main(String[] args) {
		String [][] word = {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer", "����"}
		};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i< word.length; i++) {
			System.out.printf("Q%d.%s�Ƕ���?", i+1, word[i][0]);
			
			String tmp =sc.nextLine();
			
			if(tmp.equals(word[i][1])) {
				System.out.printf("�����Դϴ�%n%n");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ� ������ %s�Դϴ�.%n%n",word[i][i]);
			}
		}

	}

}
