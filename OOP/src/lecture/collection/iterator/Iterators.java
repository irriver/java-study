package lecture.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
	Iterator �������̽�
	hasNext(), Next(), remove() �޼ҵ带 ����
	ArrayList��  Iterator�� �����ϰ� �����Ƿ� ���� �޼ҵ带 ����� �� �ִ�. 
	
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
