package co.maraq.control;

import co.maraq.classes.Person;

/*
클래스의 종류
	LIB: class Test {메인 함수가 없음}	>>	독자적인 실행이 불가능 = 다른 클래스가 참조하는 클래스
	class Test {
		public static void main(String[] args){}	>>	실행가능한 클래스
	}
	static void main()	>> 프로그램의 진입점, 시작점
Tip)
	C#: static void Main(){}
  
변수
	데이터나 자료를 담을 수 있는 공간의 이름
	공간이 있으려면 '크기'가 있어야 함	>>	type(자료형)
	
	  
*/

public class Control {
	
	public static void main(String[] args) {
		Person p = new Person("Charlie", 15);
		System.out.println(p.pName + p.age);
		p.run(500);
		p.print();
		System.out.println("class Person의 객체 p의 주소 " + p);
	}
}
