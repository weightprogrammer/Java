package kosta.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class Mission {

	public static void main(String[] args) {
		
		Copyutil c = new Copyutil();
		
		
		// 1.����Ʈ��Ʈ���� �̿��Ͽ� ���� ����  �����ϼ���
		File source= new File( "C:\\Users\\�����\\Desktop\\�߰��׽�Ʈ");
		File dest = new File( "C:\\Users\\�����\\new_211");
		
		
		try {
			Copyutil.copyDirectory(source, dest);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
