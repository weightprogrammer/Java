package kosta.Thread;

import javax.swing.JOptionPane;

public class Ex1 extends ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ����"+ input + "�Դϴ�");
	}

}
