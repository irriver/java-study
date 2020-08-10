package co.maraq.classes;

public class Person {
	/*
	 	변수는 선언되는 위치에 따라서 다름 (scope: 유효범위)
	 	
	 	1. Instance Variable >> 함수 아닌 설계도 안, 초기화 안해도 내부적으로 기본값을 가짐(default value: 0)
	 	2. Local Variable >> 함수 안에
	 	3. Static Variable >> 객체 간 공유자원
	 */
	//인스턴스 변수를 '초기화' 하지 않는 이유 >> 객체마다 '다른 값'을 가져가려고
	public String pName;
	public int age;
	
	//생성자 함수: 객체가 생성될 때 자동으로 호출되는 함수 = '객체 생성과 동시에'
	public Person() {
		System.out.println("객체 Person이 생성되어 '생성자'를 호출합니다.");
	}
	
	public Person(String pName, int age) {
		System.out.println("객체 Person이 생성되어 '생성자'를 호출합니다.");
		System.out.println("객체의 iv를 받아 강제로 초기화 합니다.");
		this.pName = pName;
		this.age = age;
	}
	
	//함수: 기능, 행위
	public String eat() {
		// lv >> method eat()이 호출되면 생성되고, 종료되면 메모리에서 사라진다
		// 로컬변수는 '사용 전에' 메소드 내에서 반드시 '초기화'가 필요
		String food = "Buritto";
		return food;
	}
	
	public void print() {
		System.out.println("오늘 뭘 먹었냐면 " + eat());
	}
	
	public void run(int speed) {
		System.out.println(pName + "이(가)" + speed + "속도로 달립니다.");
	}
}