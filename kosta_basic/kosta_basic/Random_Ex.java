package kosta_basic;

import java.util.Random;

public class Random_Ex {

	public static void main(String[] args) {
		// MathŬ���� �ȿ� random ()�ż���
	 double	d= (int)(Math.random() *6) +1;// 1 ~6 ���� �̴� ���
	 //System.out.println(d);
	
	 //Roandom Ŭ���� nextInt()���
	 Random r = new Random();
	 int d2 = r.nextInt(45) +1;
	 System.out.println(d2);

	}

}
