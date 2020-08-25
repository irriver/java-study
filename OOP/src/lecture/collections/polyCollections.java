package lecture.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class polyCollections {
	public static void main(String[] args) {
		List list = new ArrayList();
		//list interface의 메소드 혹은, 
		list.add('A');
		list.add('B');
		list.add('A');	//중복가능
		list.add('C');
		
		System.out.println(list.toString());
		List list2 = list.subList(1, 4);
		
		ArrayList alist = new ArrayList();
		alist.add(10);
		alist.add(10);
		alist.add(10);
		alist.add(11);
		alist.add(10);
		alist.add(10);
		
		System.out.println(alist.toString());
//		Collections.sort(list);
//		System.out.println(list.toString());
	}
}
