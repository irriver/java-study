package lecture.collections;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al.toString());
		System.out.println(al.get(1));
/*		
		[Insert data in order to arrayList]
		Type safety: 
		The method add(int, Object) 
		belongs to the raw type ArrayList. 
		References to generic type ArrayList<E> 
		should be parameterized
*/
		al.add(0, 111);
		System.out.println(al.toString());
		al.add(3, 333);
		System.out.println(al.toString());
		
		ArrayList<String> alStr = new ArrayList<String>();
		alStr.add("Hello");
		alStr.add(" ");
		alStr.add("World!");
		alStr.add("!");
		
		System.out.println(alStr.toString());
		
		System.out.println(alStr.isEmpty());
		System.out.println(alStr.size());
		Object strObj = alStr.remove(0);
		System.out.println(strObj);
		System.out.println(alStr.toString());
		System.out.println(alStr.size());
	}
}