package review;

import java.util.Scanner;

public class while_ex03 {

	public static void main(String[] args) {
		// ����� ���� ���ڸ� �Է� �ް� �� ������ �� �ڸ��� ���� ���غ���
		
		int num = 0, sum=0;
		System.out.print("���ڸ� �Է��غ���(��:1234) ");
		
		Scanner sc= new Scanner(System.in);
		String tmp = sc.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		num= Integer.parseInt(tmp);
		
		while(num!=0) {
			//num�� 10���� ���� �������� sum�� ����
			sum+= num%10; //sum = sum+num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /=10; //num =num / 10; num�� 10���� ���� ���� �ٽ� num�� ����
		}
		System.out.println("�� �ڸ����� ��:" + sum);
	}

}
