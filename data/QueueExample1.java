package kosta.data;

import java.util.LinkedList;

public class QueueExample1 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("�䳢");
		queue.offer("����");
		queue.offer("�ϸ�");
		while(!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}

	}

}
