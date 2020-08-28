package lecture.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String[] args) {
		
		HashSet<Integer> hsInt = new HashSet<Integer>();
		hsInt.add(1);
		hsInt.add(100);
		
		boolean isAddable = hsInt.add(55);
		System.out.println(isAddable);	//true
		
		isAddable = hsInt.add(100);
		System.out.println(isAddable);	//false
		
//		----------------------------------------------
		
		String[] objStr = {"a", "b", "c", "d", "e"};
		HashSet<String> hsStr = new HashSet<String>();
		for (int i = 0; i < objStr.length; i++) {
			hsStr.add(objStr[i]);
		}
		System.out.println(hsStr.toString());
		
//		----------------------------------------------
		
		HashSet<Integer> hsLotto = new HashSet<Integer>();
//		HashSet은 중복을 허용하지 않으므로 size()가 6보다 작을 때까지 반복시킨다면, 중복값이 나올 경우 새로운 숫자를 뽑을 것
		for (int i = 0; hsLotto.size() < 6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			hsLotto.add(num);
		}
		System.out.println("Lotto >> " + hsLotto.toString());
		
//		-----------------------------------------------
		
		while (hsLotto.size() < 6) {
			hsLotto.add((int) (Math.random() * 45 + 1));
		}
		
		Iterator<Integer> itrLotto = hsLotto.iterator();
		while (itrLotto.hasNext()) {
			System.out.println(itrLotto.next());
		}
	}
}
