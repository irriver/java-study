package lecture.collection.set;

public class TreeSet {
	//TreeSet 
			//순서(x) , 중복(x) , 정렬 (0))
			//검색하거 정렬 필요로 하는 자료구조 (데이터 집합)
			//로또 ....
			//1. 이진 트리 구조
			//2. 데이터 저장될때 정렬된다
			Set<Integer> lotto = new TreeSet<Integer>();
			for(int i = 0 ;  lotto.size()  < 6 ; i++) {
				lotto.add((int)(Math.random()*45 + 1));
			}
			System.out.println(lotto.toString());
}
