package kosta.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {
	
	public static void show(List<String> list) {
	
//		int num = list.size();
//		for(int i =0; i< num; i+=1) {
//			System.out.print(list.get(i)+", ");
//		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// List �ڷᱸ���� Ȱ���Ͽ� Ű����� ���ڿ� �Է¹޾�
		// ������ �߰�, ���� ����� ����
		LinkedList<String>list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int idx = -1;
		
		while(true) {
			System.out.println("1.�߰� 2.����3.����");
			System.out.print("���� : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.print("�Է�: ");
				list.add(sc.nextLine());   //String str = sc.nextLine();
				show(list);					//list.add(str);
				break;						//show(list);
//			case "2":
//				System.out.println("����: ");
//				String str = sc.nextLine();
//				idx =list.indexOf(str);
//				if(idx != -1) {
//					System.out.print("��������: ");
//					list.set(idx, sc.nextLine());
//				}
//				show(list);
//				break;
			case "2":
				System.out.print("����: ");
				String str2 = sc.nextLine();
				
				int idx1 = list.indexOf(str2);
				if( idx1!= -1) {
					list.remove(idx1);
				}
				show(list);
//				idx = list.indexOf(str2);
//				if (idx != -1) {
//					list.remove(idx);
//				}
//				show(list);
				break;
			case "3":
				System.out.println("���� ");
				return;
			}
		}
	}

}
