package lecture.interfaces;

interface Movable { void move (int x, int y); }
interface Attackable { void attack (int x, int y); }

interface Fightable extends Movable, Attackable {}

public class Fighter implements Fightable {
	//인터페이스 Fightable에 정의된 추상메소드 move(), attack()을 완성
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(int x, int y) {
		
	}
	
}
