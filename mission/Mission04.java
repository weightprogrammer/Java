package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		//Ű����� ���� id, pass�Է� �޾Ƽ�
		//id,pass ��ġ�ϸ� "�α��μ���"
		//���н� "�α��� ����"
		//id ����ġ => �ش� ���̵� �������� �ʽ��ϴ�.
		//pass ����ġ => ��й�ȣ�� ��ġ���� �ʽ��ϴ�.
		//Scanner => nextLine() => ���� ���ڿ� �о���� ���
		//���ڿ� ��ġ=> ���ڿ�.equals("���ڿ�")
		//�ٽ� �غ��� ����
		
		String m_id = "kosta";
		String m_pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id:");
		String id = sc.nextLine();
		System.out.println("pass:");
		String pass = sc.nextLine();
		
		if(id.equals(m_id) && pass.equals(m_pass)) {
			System.out.println("�α��μ���");
		}else {
			if(!id.equals(m_id)){
				System.out.println("�ش���̵� ���������ʽ��ϴ�.");
			}else {
				System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�.");
			}
	 }
 }
}
