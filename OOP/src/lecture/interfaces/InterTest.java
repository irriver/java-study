package lecture.interfaces;

//	인터페이스 = 상수 + 추상메소드
interface Repairable {
}

class Unit {
	int hitPoint;
	final int MAX_HP; // 생성자 통해서 상수 초기화

	public Unit(int hp) {
		this.MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	public AirUnit(int hp) {
		super(hp);
	}
}

class CommandCentre {
	
}

class Tank extends GroundUnit {
	public Tank(int hp) {
		super(50);	// -> GroundUnit -> Unit -> MAX_HP = 50
		this.hitPoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank";
	}
}

class Marine extends GroundUnit {
	public Marine(int hp) {
		super(60);
		this.hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine";
	}
}

class Scv extends GroundUnit {
	public Scv() {
		super(70);
		this.hitPoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}
	
	void repair(Tank tank) {
		if (tank.hitPoint != tank.MAX_HP) {
			tank.hitPoint += 5;
		}
	}
	void repair(Scv s) {
		if (s.hitPoint != s.MAX_HP) {
			s.hitPoint += 5;
		}
	}
}

public class InterTest {
	public static void main(String[] args) {
		
	}
}
