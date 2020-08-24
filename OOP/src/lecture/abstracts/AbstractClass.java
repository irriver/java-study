package lecture.abstracts;
/*
	�̿ϼ� ���赵
	1) �ϼ��� �ڵ� + �̿ϼ� �ڵ�
	2) �ϼ�: �޼ҵ� ����� ��	+ �̿�: �޼ҵ� ������ ��
	3) �ϼ��� Ŭ����	>> new ����	>> �̿�: ������ ��ü ���� �Ұ���
	
	>>	���������δ� '�ϼ��� Ŭ����'�� ������	>> '���'�� ���ؼ� �ϼ���ų ��
*/

//	unit: ���� �Ӽ��� ����
//	��, ���ֺ��� �̵� ����� �ٸ�	>> ���ֺ��� ������ �޼ҵ带 ����

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
	void move(int x, int y) {			//������� ����
		System.out.println("Tank�� " + x +", " + y + "�� �̵�");
	}
	
	void chmod() {
		System.out.println("Tank ��ȯ ���");
	}
}

class Marine extends Unit {
	@Override
	void move(int x, int y) {
		System.out.println("Marine�� " + x +", " + y + "�� �̵�");
	}
	
	void stimpack() {
		System.out.println("Marine ������ ���");
	}
}

class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("DropShip�� " + x +", " + y + "�� �̵�");
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
