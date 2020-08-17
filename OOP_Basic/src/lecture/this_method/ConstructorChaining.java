package lecture.this_method;

class CoolCar {
	String color;
	String gearType;
	int door;

//	1)생성자와  2)생성자에서 필드 초기화 하는 부분이 ***반복되는 문제
	CoolCar() {
		this("RED", "Auto", 2);		//Call
//		this.color = "RED";
//		this.gearType = "Auto";
//		this.door = 2;
		System.out.println("Default Constructor!");
	}

	CoolCar(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("Overloading Constructor!");
	}

	void printAttr() {
		System.out.println(this.color);
		System.out.println(this.gearType);
		System.out.println(this.door);
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		CoolCar car = new CoolCar();	//1) 기본생성자 호출 - 2) 매개변수 3개인 생성자 서칭 - 3) 실행: 매개변수로 들어온 값을 멤버필드에 할당 -  
		car.printAttr();
	}
}
