package kosta.io;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferEx {

	public static void main(String[] args) {
		// ����� ��Ʈ���̿� ��ĳ�� ���X
		// System.in : InputStream =>InputStreamReader =>BufferedReader
		
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = "";
		
		try {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("�Է� :");
			while((str = br.readLine()) != null){
				str += "\n";
				bw.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			}catch (Exception e2) {}
		}

	}

}
