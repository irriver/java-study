package lecture.singleton;

public class Singleton {
	private static Singleton singleObj;
	private Singleton() {
		//직접 객체 생성 불가	>> new가 안됨
	}
	
	public static Singleton getInstance() {
		if (singleObj == null) {
			singleObj = new Singleton();	//heap 메모리에 singleton 객체가 올라옴 >> 객체의 주소를 singleton이 참조
		}
		return singleObj;
	}
}
