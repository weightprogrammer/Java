package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FikeWriterEx {

	public static void main(String[] args) {
		// q �� �Է��ϸ� ����
		
		FileWriter writer = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�: ");

		String str = "";
		String pem = "";

		while (!(str = sc.nextLine()).equals("q")) {
			pem += str;
			pem += "\n";
		}

		try {
			writer = new FileWriter("pem3");
			writer.write(pem);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e2) {
			}

		}

	}

}
