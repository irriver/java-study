package kr.or.bit;

public class Quiz {
	public int max(int a, int b) {
		int result = 0;
		
		if (a > b) {
			result = a;
		} else {
			result = b;
		}
		return result;
	}
	 
	public int refindedMax(int a, int b) {
		return (a > b) ? a : b;
	}
	
//	Ŭ���� Ÿ���� �����ϴ� �޼ҵ�	>> TvŸ���� ������ '****�ּ�'�� ����	>> new
	public Tv tvCall() {
		// Tv()��ü -> Heap Memory�� ������ ��ü�� method�� ������ ������� ����!!
		// ��, Stack�� ���� �������� t�� �����.
		Tv t = new Tv();
		return t;
	}
	public Tv tvCall2() {
		// �������� t�� ������ �ʴ´ٸ� �ٷ� ��ü�� ��ȯ�ϴ� �� ����.
		return new Tv();
	}
	
//	Ŭ���� Ÿ���� �Ű������� �޴� �޼ҵ�
	public void tvCall3(Tv t) {
		System.out.println("Tv ��ü�� �ּҰ�: " + t);
	}
	
	
}
