package kr.or.bit;

public class CapsuleNotebook {
	public String color;

//	만약 public이면 여기에 들어가면 안되는 값이 대입될 수도 있어	>>	예) 음수
	public int openYear;
//	캡슐화	>>	직접 할당을 막고 간접 할당을 통해서 데이터를 보호
	private int secretYear;

	public CapsuleMouse capsuleMouse;

//	캡슐화된 멤버 필드에 대해서 쓸 수 있고(set), 읽어올 수 있는(get) 메소드
//	간접할당
	public void setOpenYear(int y) {
		if (y < 0) {
			this.openYear = -1;
		} else {
			this.openYear = y;
		}
	}

//	parameter: Class, return: Class
//	parameter 자리에 온 것은 ***주소값 >> 주소값을 받으려면 new 연산자가 필요
	public CapsuleMouse handleMouse(CapsuleMouse mouseAddr) {
		mouseAddr.x = 100;
		mouseAddr.y = 200;
		return mouseAddr;
	}
}
