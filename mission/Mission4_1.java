package kosta.mission;

import java.util.Scanner;

public class Mission4_1 {

	//�α��� üũ �޼��� ����
	// �޼��� ( id, pass) {
		//���� �� 0 => ���� 1=>����
	//}
	public static int login(String id, String pass) {
		String m_id = "kosta";
		String m_pass = "1234";
		
		if(id.equals(m_id) && pass.equals (m_pass)) {
			return 1;//������ Ÿ���� ��ġ�ؾ��Ѵ�.
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("id:");
		String id = sc.nextLine();
		System.out.println("��й�ȣ");
		String pass = sc.nextLine();
		int re = login(id, pass);
				
		if(re == 1) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("�����Դϴ�");
		}
		
	}

}
