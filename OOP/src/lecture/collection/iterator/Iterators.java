package lecture.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
	Iterator 인터페이스
	hasNext(), Next(), remove() 메소드를 보유
	ArrayList는  Iterator를 구현하고 있으므로 위의 메소드를 사용할 수 있다. 
	
	public Iterator iterator() {
		return new Interaface implements Iterator;
	}
*/
public class Iterators {
	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(100);
		li.add(200);
		li.add(300);
		
//		for (int item : li) {
//			System.out.println(item);
//		}
		
		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		Iterator<Integer> itrInt = intList.iterator();
		while (itrInt.hasNext()) {
			System.out.println(itrInt.next());
		}
		
		//Reverse Search -> forward >> reverse
		ListIterator<Integer> itrList = intList.listIterator();
		while (itrList.hasNext()) {
			System.out.println(itrList.next());
		}
		//Reverse
		while (itrList.hasPrevious()) {
			System.out.println(itrList.previous());
		}
		
	}
}
