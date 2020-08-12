package modifier;

/*
 	getter�� setter�� �ʿ信 ���� ���� ���� ��������
 	����, private window = 10;���� ���� �����ؼ� �Ҵ��Ѵٸ�
 	���� setter�� ����� ���� �Ҵ��� �ʿ�� ������
 */

public class Car {
	private int window;
	private int speed;
	private boolean stop;

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public int getSpeed() {
		return speed;
	}

	// Quiz	>>	���� speed�� ������ ������ 0 ���� ���� ����
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = -1;
		} else {
			this.speed = speed;
		}
	}
	
	//Quiz	>> �ӵ��� 10�� �ø��� ������ ���
	public void upSpeed() {
		this.speed += 10;
	}

	public void downSpeed() {
		if (this.speed < 0) {
			this.speed = 0;
		} else {
			this.speed -= 10;
		}
	}
	
	public boolean isStop() {	//false
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}