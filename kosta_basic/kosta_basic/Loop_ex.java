package kosta_basic;

import java.util.Scanner;

public class Loop_ex {

	public static void main(String[] args) {
	// while :�ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : �������ⱸ��
		
	// for : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ :������
		
	//do ~ while : ����� ���� ���� ������ ��
		
	//��� 1���� ������ ������ �ʿ��� ���
		
		
	//������ 7�� ���
	//ex 7 *1 =7
		
	//1 ~100 ���̿� 2�� ��� �� 3�� ����� �ƴ� ���ڸ� ����ϼ���.
		
		
//		for(int i =1;i<=100;i++) {
//			if(i%2==0||i%3==0) {
//				continue;
//			}
//		}
//	}
//}
		
		int sum = 0;
		int num = 0;
	    Scanner scanner = new Scanner(System.in);
        System.out.print("�����: ");
        num = scanner.nextInt();
        
        for(int i= 0; i< num ; i++) {
        	if((i%2)==0) {
        		continue;
        	}else if((i%3)== 0) {
        		continue;
        	}else {
        		System.out.println(i + "");
        		sum +=1;
        	}
        }
	}
}
//	}
//}
//		for(int i= 1; i<=100;i++) {
//			if(!(i%2==0||i%3==0)) {
//				System.out.println(i +",");
//			}
//		}
//		
//	}
//}
		
//		int sum = 0;
//		     //�ʱ��            //���ǽ�
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("1 ~10���� ����" + sum);
		
//		int sum =0;
//		for(int i=1; i<=9; i++) {
//			System.out.println("7 *"+ i +"=" +7*i);
//		}
		
//		System.out.println("7��");
//		int sum =0;
//		//�ʱ�� ��� ���� ������ ������
//		int i =1;
//		//���ǽ� � ������ �ɰ���
//		while(i <= 10) {
//			
//			sum += i;
//			//������ 
//			i++;
//		}
//      ��ɹ� � ����� ��������
//		System.out.println("1 ~10���� ����" + sum);


