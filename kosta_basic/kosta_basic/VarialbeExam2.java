package kosta_basic;

public class VarialbeExam2 {

	public static void main(String[] args) {
//		int num1;//���� ����
//		num1 = 10;//���� �ʱ�ȭ
		
		int num1 = 10; //���� ���� ,�ʱ�ȭ
		
//�⺻���ͷ�:����(int),�Ǽ��� (double),''(char),""(String), true/false (boolean)

		float num2 = 3.14f;
		double num3 = 3.14;
		
		char num4 = 'A';
		String num5 = "ABC";
		
		boolean num6 = false;
		
//����ȯ (Casting) : �⺻�� �������� (byte, short, int , long , flaot, double, cher)
//byte< short < int < long < float < double
		
		double n = 3.14 + 10; // ������ ����ȯ
		int n2 = (int) (3.14 + 100); //���� ����ȯ
		
		int num7 = 86;
		System.out.println((char)num7);
		
		for(int i =65; i<=125; i++) {
//			System.out.println((char)i);
		}
		//���ڿ��� �ٸ� ������������ ���� => ���ڿ��� ����ȯ
		//���ڿ� > �ٸ� ��������
		String num8 = 7 +"6" +7;
		System.out.println(num8);
		
		num8 ="�ȳ�"; 
		//���ڿ��� =>���������� ����ȯ "767" + 10 =>777
		//NumberFormatException ������ ������ Integer.parseInt �� ������ ���� Ȯ������ 
		int num9 = Integer.parseInt(num8);
		
		int num10 = num9 + 10;
		System.out.println(num10);
		
		
	}

}
