package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String, String> map =
				new HashMap<String, String>();
		
		map.put("1", "NC");
		map.put("2", "�λ�");
		map.put("3", "�Ｚ");
		
		System.out.println("����� ������ :" + map.size());
		
		if(map.containsValue("�λ�")) {
			map.remove("2");
		}
		System.out.println("����� ������ :" + map.size());
		//System.out.println(map.get("1"));
		
		//Map Ű�� �˾ƾ� ��ü����� ����Ҽ� �ִ�.
		//Map => Set => Iterator
		//map.ketset �� Ű�� ����� ����� ��δ�  entrySet
		Set set = map.entrySet();
		Iterator iter = set.iterator();//map�� Ű�� ����� �� ����ִ�.
		//Iterator �� ���� �ٸ� ������ �̶� �ϰ����ִ� ������ ������ ����ϱ� ���ؼ�
		while(iter.hasNext()) {
			Map.Entry<String, String> e =
					(Map.Entry<String, String>)iter.next();
			
			System.out.println("Key:" +e.getKey() + 
					"value :"+ e.getValue());
		}
	}

}
