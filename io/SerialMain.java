package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialMain {
	Member m;
	
	public void write() {
		m = new Member("ȫ�浿",20);
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	//������ȭ
	public void read() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m= (Member)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		SerialMain sm = new SerialMain();
		
		sm.write();//����ȭ
		sm.m = null;
		sm.read();//�� ����ȭ
		System.out.println(sm.m);

	}

}
