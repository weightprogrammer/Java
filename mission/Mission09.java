package kosta.mission;

import java.util.Scanner;

public class Mission09 {
	// �޴��� �����ؼ� �ش� �޴��� ����� �����غ���.
			//1�� �߰� 2.���3.�˻�4.���� ����ġ
			//string �迭 ����
			//�Է� :1 �� �ϸ�
			//�迭�� ������ �߰�
			//�Է� :2 ���ϸ�
			//�迭�� �ִ� �����Ͱ� ���
			//�Է� :3 ���ϸ�
			//�ش� ���ڿ��� �ε����� ���
			//�Է� :4��
			//return;

	public static void main(String[] args) {

		// 1.�迭����
		String[] names = new String[3];
		int size = names.length;
		// 2.�Է¹ޱ�
		Scanner put = new Scanner(System.in);
		// 3.�Էµ� �̸��� �迭�� ������ �°� ����
		for (int i = 0; i < size; i++) {
			System.out.print("�̸��� �Է��ϼ���. ");
			names[i] = put.next();
		}
		for (int i = 0; i < size; i++) {
			// 4.ȭ�鿡 �Էµ� �̸��� ǥ���Ѵ�.
			System.out.println("�̸�: " + names[i]);
		}
	}
}