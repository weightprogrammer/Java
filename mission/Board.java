package kosta.mission;

public class Board {
	//�Խ��ǿ� �������� ���� �Է� �ް� ��ü�� ����ϴ� ���α׷��� ��������(������ ���)
	//�۹�ȣ, ������, ����
	//����� �۾���, ��ü �� ���
	
	int tnum;
	String tName;
	String tStory;
	String contents;
	
	public Board() {}

	public Board(int tnum, String tName, String tStory ,String contents) {
		super();
		this.tnum = tnum;
		this.tName = tName;
		this.tStory = tStory;
		this.contents =contents;
	}
	//����� �־���Ѵ�. �� 1/ ���� �׷���. / ���� ���α׷����� �Ѵ�.
	
	public void boardPrint() {
		System.out.println(tnum + "\t" + tName + "\t" +tStory+"\t"+contents);
	}
	
}
