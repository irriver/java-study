package lecture.collection.set;

public class TreeSet {
	//TreeSet 
			//����(x) , �ߺ�(x) , ���� (0))
			//�˻��ϰ� ���� �ʿ�� �ϴ� �ڷᱸ�� (������ ����)
			//�ζ� ....
			//1. ���� Ʈ�� ����
			//2. ������ ����ɶ� ���ĵȴ�
			Set<Integer> lotto = new TreeSet<Integer>();
			for(int i = 0 ;  lotto.size()  < 6 ; i++) {
				lotto.add((int)(Math.random()*45 + 1));
			}
			System.out.println(lotto.toString());
}
