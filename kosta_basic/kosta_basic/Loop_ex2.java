package kosta_basic;

public class Loop_ex2 {

	public static void main(String[] args) {
		//��ø for�� -> for���ȿ� for�� �ִ°��
//		for(int i =1; i<=3;i++) {
//			for(int j=1; j<=2;j++) {
//				System.out.println("i=" + i +"," + "j" + j);
//			}
//		}
         //������ 2�� ~ 9�� ���
		//int sum =0;
//		for(int i=1; i<=9; i++) {
//			System.out.println("7 *"+ i +"=" +7*i);
//		}
		
//		System.out.println("7��");
//		for(int i =2;i<=9;i++) {
//			System.out.println("##" + i+ "��##");
//			for(int j=1;j<=9;j++) {
//				System.out.println(i +"*" +j + "=" +i*j);
//			}
//		}
		
		//4x+5y =60 => x,y�� ������.
//		for(int x=0;x<=15;x++) {
//			for(int y=0; y<=15; y++) {
//				if((4*x)+(5*y)==60) {
//					System.out.println(x + "," + y );
//				}
//			}
//				
//		}
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
