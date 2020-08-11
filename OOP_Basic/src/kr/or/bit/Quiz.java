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
	
//	클래스 타입을 리턴하는 메소드	>> Tv타입을 가지는 '****주소'를 리턴	>> new
	public Tv tvCall() {
		// Tv()객체 -> Heap Memory에 생성된 객체는 method가 끝나도 사라지지 않음!!
		// 단, Stack에 생긴 참조변수 t는 사라져.
		Tv t = new Tv();
		return t;
	}
	public Tv tvCall2() {
		// 참조변수 t가 사용되지 않는다면 바로 객체를 반환하는 게 좋다.
		return new Tv();
	}
	
//	클래스 타입을 매개변수로 받는 메소드
	public void tvCall3(Tv t) {
		System.out.println("Tv 객체의 주소값: " + t);
	}
	
	
}
