package kosta_basic;

import java.util.Scanner;

public class RecurExam {
	
	static int f(int n) {
		if(n>0) {
			return n *f(n-1); //
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		//��� �Լ� �߿��߿� �ſ��߿�  			�˰����� �� Ǯ�� ���ؼ� (for),(if),(����Լ�),(�迭)
		//��� �Լ��� �ڱ� �ڽ��� ��� Ǯ�� ���°�
		//��� �Լ�(���丮�� ��� Ex:5!= 5 * 4 * 3 * 2 * 1)
		//��� �Լ��� �׻� Ż�� ������ �ɾ�� �Ѵ� �ȱ׷� ���ѹݺ�
		Scanner sc =new Scanner(System.in);
		System.out.print("���� �Է�:");
		int x = sc.nextInt();
		
		System.out.println(x + "!=" + f(x));
	}

}
