package modifier;

/*
 	getter와 setter는 필요에 따라 있을 수도 없을수도
 	만약, private window = 10;으로 값을 고정해서 할당한다면
 	굳이 setter를 사용해 값을 할당할 필요는 없겠지
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

	// Quiz	>>	만약 speed에 음수가 들어오면 0 으로 강제 세팅
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = -1;
		} else {
			this.speed = speed;
		}
	}
	
	//Quiz	>> 속도를 10씩 올리고 내리는 기능
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