package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		//�̸��� ������ �ѽ����� �� Map �ڷᱸ���� ��������
		//���ڹ� : 100, �� �ڹ� : 50 ~~
		//���� ������(key) =>KeySet()
		//���� (value) =>values() :collention
		
		HashMap<String, Integer>map= new HashMap<String, Integer>();
		
		map.put("�Ͼƹ�",new Integer(100));
		map.put("��Ÿ��",new Integer(98));
		map.put("�񳪴�",new Integer(82));
		map.put("���ٸ�",new Integer(77));
		map.put("��Ÿ��",new Integer(65));
		
		Set set = map.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry e =(Map.Entry)iter.next();
			System.out.println("�̸�:" + e.getKey()+",����" + e.getValue());
		}
		
		set=map.keySet();
		System.out.println("������ ��� :" + set);
		
		Collection values = map.values();
		iter = values.iterator();
		
		int total =0;
		
		while(iter.hasNext()) {
			Integer i = (Integer)iter.next();
			total += i.intValue();
		}
		
		System.out.println("���� :" + total);
		System.out.println("��� :" + (float)total/set.size());
		System.out.println("�ְ����� :" + Collections.max(values));
		System.out.println("�������� :" + Collections.min(values));
	}

}
