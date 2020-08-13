package quiz.constructor;

public class SaleCar {
	int door = 4;
	String color = "RED";
	
	//1) 문 기본, 휠 기본
	public SaleCar() {}

	//2) 문 변경, 휠 기본
	public SaleCar(int door) {
		this.door = door;
	}
	//3) 문 기본, 휠 변경
	public SaleCar(String color) {
		this.color = color;
	}
	//4) 문 변경, 휠 변경
	public SaleCar(int door, String color) {
		this.door = door;
		this.color = color;
	}
	
	
	void printAttr() {
//		System.out.println("차 이름: " + ??);
		System.out.println("차 색상: " + door);
		System.out.println("차 문 갯수: " + color);
	}
	
	public static void main(String[] args) {
		SaleCar volvo = new SaleCar();
		SaleCar audi = new SaleCar(2);
		SaleCar BMW = new SaleCar("BLACK");
		SaleCar honda = new SaleCar(6, "GREY");
		
		volvo.printAttr();
		audi.printAttr();
		BMW.printAttr();
		honda.printAttr();
	}

}
