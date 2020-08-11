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
		
//		클래스 타입을 반환한다는 것은 객체의 주소값을 반환하는 것	>> 주소값을 통해 객체에 접근 가능
		System.out.println("마우스 객체 내의 x좌표: " + mouseAddr.x);
		System.out.println("마우스 객체 내의 y좌표: " + mouseAddr.y);
		
		System.out.println(mouseAddr == mouseAddr2);
	}
}
