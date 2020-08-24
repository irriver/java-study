package lecture.interfaces;

interface Movable { void move (int x, int y); }
interface Attackable { void attack (int x, int y); }

interface Fightable extends Movable, Attackable {}

public class Fighter implements Fightable {
	//�������̽� Fightable�� ���ǵ� �߻�޼ҵ� move(), attack()�� �ϼ�
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(int x, int y) {
		
	}
	
}
