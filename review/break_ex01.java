package review;

public class break_ex01 {

	public static void main(String[] args) {
		// break �� �� �ڽ��� ���Ե� ���� ����� �ݺ����� ����� 
		// �ַ� if ���� �Բ� ���Ǿ� Ư�������� ������ �� �ݺ����� ����� �Ѵ�
		int sum = 0;
		int i = 0;
		
		while(true) {
			if (sum >100)
				break;
			++i;
			sum +=i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
