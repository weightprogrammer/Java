package review;

public class continue_ex01 {

	public static void main(String[] args) {
		// continue ���� �ݺ��� �������� ��� �Ǹ� �ݺ� ������ continue�� ������ �ݺ��� ������ �̵��Ͽ� ���� �ݺ����� �Ѿ��
		
		for(int i=0;i<=10;i++) {
			if(i%3==0)
				continue; // ���ǽ��� ���̵Ǿ� continue���� ����Ǹ� ���� ������ �̵��Ѵ�
						  // break�� �� �޸� �ݺ����� ����� �ʴ´�.
			System.out.println(i);
		}
	}

}
