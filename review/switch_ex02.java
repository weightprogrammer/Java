package review;

import java.util.Scanner;

public class switch_ex02 {

	public static void main(String[] args) {
		System.out.println("���� ���� �Է��ض�.");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt(); //ȭ���� ���� �Է¹��� ���ڸ� month �� ����
		
		if(month ==3 || month==4|| month==5) {
			System.out.println("�Է� ������ ���Դϴ�");
		}else if(month ==6 || month==7|| month==8) {
			System.out.println("�Է� ������ �����Դϴ�");
		}else if(month ==9 || month==10|| month==11) {
			System.out.println("�Է� ������ �����Դϴ�");
		}else {
			System.out.println("�Է� ������ �ܿ��Դϴ�");
//		switch (month) {
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("������ ������ ���Դϴ�.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("������ ������ �����Դϴ�.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("������ ������ �����Դϴ�.");
//			break;
//		default:
//			System.out.println("������ ������ �ܿ��Դϴ�.");
		}
	}

}
