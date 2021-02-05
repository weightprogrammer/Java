package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Copyutil {

	public static void copyDirectory(File source, File dest) throws Exception {
		dest.mkdir(); //���丮 ����
		
		//����� ���� ���Ͽ� �迭 ���� 
		File[] file = source.listFiles();
		
		//�迭�� ���
		for(int i = 0; i< file.length; i+=1) {
			File sourceFile = file[i];
			
			//���丮��� ���丮�� ����
			if(sourceFile.isDirectory()) {
				//copy �ϱ� ���� dest(kosta2�� ������ ������ ������ֱ� ���� ��ü�� ����
				
				File s_destFile = new File(dest, source.getName());
				copyDirectory(sourceFile, s_destFile);
			}else { //d�ƴ϶�� ������ ����
				File destFile = new File(dest, source.getName());
				copyFile(sourceFile, destFile);
			}
		}
	}
	
	// ����Ʈ ���� ���� ������ ����
	public static void copyFile(File source,File dest) throws Exception{
		
		int count = 0;
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		byte[] arr = new byte[500];
		
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			
			
			while((count = in.read(arr)) != -1){
				out.write(arr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {

			}

		}

	}

	
		// TODO Auto-generated method stub
		
	
}
