package modifier;

/*
 	������(������): modifier
 	public ����: package ���о��� ����
 	private ����: Ŭ���� �ֺ� �����ڿ�, �������� ���忡�� ���� �Ұ� ���(��� �Ұ�)
 	
 	��ü������
 	1) ĸ��ȭ(����ȭ)
 		>>	Ŭ���� ���ο� �ִ� �ڿ� (member field, member method) ����
 			private int number:		���� �Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ��� ��ȣ	>>	���� (�Լ� write: setter - read: getter)
 			private void call():	�ٸ� �Լ��� ����(����)	>>	Ŭ���� ���ο��� �ٸ� �Լ��� ȣ���ؼ� ��� 
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
		System.out.println("2�� up " + c.getSpeed());
		
		c.downSpeed();
		c.downSpeed();
		c.downSpeed();
		System.out.println("1�� down " + c.getSpeed());
		
		boolean result = c.isStop();
		System.out.println(result);
		
		if (!c.isStop()) {
			c.setStop(true);
		}
		boolean result2 = c.isStop();
		System.out.println(result2);
	}
}