package kr.or.bit.common;

import kr.or.bit.CapsuleMouse;
import kr.or.bit.CapsuleNotebook;

public class CapsuleMain {
	public static void main(String[] args) {
		
		CapsuleNotebook noteBook = new CapsuleNotebook();
		noteBook.setOpenYear(-1000);
//		System.out.println(note.openYear);
		
		CapsuleMouse mouseAddr = new CapsuleMouse();
		CapsuleMouse mouseAddr2 = noteBook.handleMouse(mouseAddr);
		
//		Ŭ���� Ÿ���� ��ȯ�Ѵٴ� ���� ��ü�� �ּҰ��� ��ȯ�ϴ� ��	>> �ּҰ��� ���� ��ü�� ���� ����
		System.out.println("���콺 ��ü ���� x��ǥ: " + mouseAddr.x);
		System.out.println("���콺 ��ü ���� y��ǥ: " + mouseAddr.y);
		
		System.out.println(mouseAddr == mouseAddr2);
	}
}
