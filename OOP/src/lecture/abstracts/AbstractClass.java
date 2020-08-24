package lecture.abstracts;
/*
	미완성 설계도
	1) 완성된 코드 + 미완성 코드
	2) 완성: 메소드 실행블럭 유	+ 미완: 메소드 구현부 무
	3) 완성된 클래스	>> new 가능	>> 미완: 스스로 객체 생성 불가능
	
	>>	최종적으로는 '완성된 클래스'를 만들어야	>> '상속'을 통해서 완성시킬 것
*/

//	unit: 공통 속성을 가짐
//	단, 유닛별로 이동 방법은 다름	>> 유닛별로 별도의 메소드를 구현

abstract class Unit {
	int x;
	int y;
	
	void stop() {
		System.out.println("Unit Stop!");
	}
	
	abstract void move(int x, int y);
}

class Tank extends Unit {
	@Override
	void move(int x, int y) {			//실행블럭을 구현
		System.out.println("Tank는 " + x +", " + y + "로 이동");
	}
	
	void chmod() {
		System.out.println("Tank 변환 모드");
	}
}

class Marine extends Unit {
	@Override
	void move(int x, int y) {
		System.out.println("Marine이 " + x +", " + y + "로 이동");
	}
	
	void stimpack() {
		System.out.println("Marine 스팀팩 기능");
	}
}

class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("DropShip이 " + x +", " + y + "로 이동");
	}
	
	void load() {
		System.out.println("DropShip Loaded...");
	}
	void unLoad() {
		System.out.println("DropShip UnLoaded...");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Tank[] teamTank = {new Tank(), new Tank(), new Tank()};
		for (Tank tank : teamTank) {
			tank.move(555, 444);
		}
		System.out.println();
		
		Unit[] teamUnit = {new Tank(), new Marine(), new DropShip()};
		for (Unit unit : teamUnit) {
			unit.move(666, 444);
		}
	}
}
