package lecture.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put(1, "Tigger");
		map.put(1, "Igor");	//���
		map.put(2, "Piglet");
		map.put(3, "Pooh");
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("Pooh"));
		
		System.out.println(map.get(1));
		System.out.println(map.size());
		
		Object item = map.remove(2);
		System.out.println(map.toString());
		
//		------------------------------------------
		
//		�ߺ� X, ���� X
		Set set = map.keySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collection colList = map.values(); 
		System.out.println(colList.toString()); //HashMap�� value�� �ߺ����� �������� ������ �������̽���  
	}
}
