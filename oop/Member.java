package kosta.oop;

public class Member {

	String name;
	int age;
	
	//����Ʈ ������
	//�Ķ���Ͱ��� ���� �ʴ� ����
	public Member(){} //����Ʈ ������
	
	//�׻� �����ڸ� ���鶧 �� ��b �����ڸ� ������
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println("�̸�" +name);
		System.out.println("����" + age);
	}

	
}
