package modifier;

/*
 	접근자(한정자): modifier
 	public 공유: package 구분없이 공유
 	private 개인: 클래스 애부 공유자원, 참조변수 입장에서 접근 불가 사용(사용 불가)
 	
 	객체지향언어
 	1) 캡슐화(은닉화)
 		>>	클래스 내부에 있는 자원 (member field, member method) 적용
 			private int number:		직접 할당을 막고 간접할당을 통해서 자원을 보호	>>	간접 (함수 write: setter - read: getter)
 			private void call():	다른 함수의 보조(공통)	>>	클래스 내부에서 다른 함수가 호출해서 사용 
 */
public class ModifierTest {
	public static void main(String[] args) {

		Car c = new Car();
		c.setSpeed(10);
		c.setWindow(2);

		System.out.println(c.getSpeed());
		System.out.println(c.getWindow());

		c.upSpeed();
		c.upSpeed();
		System.out.println("2번 up " + c.getSpeed());
		
		c.downSpeed();
		c.downSpeed();
		c.downSpeed();
		System.out.println("1번 down " + c.getSpeed());
		
		boolean result = c.isStop();
		System.out.println(result);
		
		if (!c.isStop()) {
			c.setStop(true);
		}
		boolean result2 = c.isStop();
		System.out.println(result2);
	}
}