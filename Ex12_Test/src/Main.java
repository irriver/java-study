import kr.or.bit.common.Car;

//	지금까지 main클래스 안에서 연습용으로 만든 모든 class는 default 였음
//	그래서 같은 패키지 안에서만 사용가능 했음
//	단, 'public'은 하나만 사용가능
class Test {
	String default_iv;
	public String public_iv;
	private String private_iv;
}

public class Main {

	public static void main(String[] args) {
		// Car 가 public 이기 때문에 다른 패키지의 자원을 가져다 쓸 수 있어
		Car car = new Car();
		car.window = 5; 
		// 다른 패키지 안에 있음으로 접근제한자 default도 사용 불가능
//		Airplane airplane = new Airplane();

		// 같은 패키지 안에 있음으로 접근제한자 default도 사용 가능
		Air air = new Air();

		Test t = new Test();
		t.default_iv = "같은 패키지 안의 클래스라서 t를 통해 접근 가능";
		t.public_iv = "모두가 접근 가능";
//		t.private_iv = "getter, setter를 통해서만 접근 가능";
	}
}
