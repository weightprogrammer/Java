package kosta.mission;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Board arr[] = {
				new Board(1, "java", "vare", "good"),
				new Board(1, "html", "vare", "notbad")
		};
		
		int arr2[] = {1};
//		Board b1 = new Board(1, "java", "vare", "good");
//		Board b2 = new Board(1, "html", "vare", "notbad");
	
		System.out.println("��ȣ" + "\t" +"����" +"\t" +"�ۼ���" +"\t" +"����");
		for(int i=0; i<arr.length;i++) {
			arr[i].boardPrint();
		}
	}

}
