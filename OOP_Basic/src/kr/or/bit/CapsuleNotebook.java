package kr.or.bit;

public class CapsuleNotebook {
	public String color;

//	���� public�̸� ���⿡ ���� �ȵǴ� ���� ���Ե� ���� �־�	>>	��) ����
	public int openYear;
//	ĸ��ȭ	>>	���� �Ҵ��� ���� ���� �Ҵ��� ���ؼ� �����͸� ��ȣ
	private int secretYear;

	public CapsuleMouse capsuleMouse;

//	ĸ��ȭ�� ��� �ʵ忡 ���ؼ� �� �� �ְ�(set), �о�� �� �ִ�(get) �޼ҵ�
//	�����Ҵ�
	public void setOpenYear(int y) {
		if (y < 0) {
			this.openYear = -1;
		} else {
			this.openYear = y;
		}
	}

//	parameter: Class, return: Class
//	parameter �ڸ��� �� ���� ***�ּҰ� >> �ּҰ��� �������� new �����ڰ� �ʿ�
	public CapsuleMouse handleMouse(CapsuleMouse mouseAddr) {
		mouseAddr.x = 100;
		mouseAddr.y = 200;
		return mouseAddr;
	}
}
