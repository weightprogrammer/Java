package kosta.Day11;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class main {
	
	public static void showProduct(Product[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i].show();
			System.out.println();
		}
	}
	
	public static Product getProduct(int no, Product[] arr) {
		Product p = null;
		for(int i=0;i<arr.length;i++) {		
			if(no == arr[i].getNumber() ) {
				p = arr[i];
				break;
			}
		}
		
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		
		Product arr[] = {
			new Phone(1, "������S21", 500000),	
			new Phone(2, "������12", 800000),
			new NoteBook(3, "�׷�16", 1500000)
		};
		
		while(true) {
			showProduct(arr);//��ǰ��� ���
			
			System.out.println("1.��ٱ��� �߰�  2.��ٱ��� ���  3.����");
			System.out.print("����: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:				
				System.out.print("��ǰ����: ");
				int no = sc.nextInt();
				Product p = getProduct(no, arr);
				cart.addCart(p);//��ٱ��� �߰�
				break;
			case 2:
				cart.orderList();//��ٱ��� ���
				break;
			case 3:
				System.out.println("����");
				return;
			}
		}
		
		
	}

}
