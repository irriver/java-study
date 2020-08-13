package quiz.constructor;

public class SaleCar {
	int door = 4;
	String color = "RED";
	
	//1) �� �⺻, �� �⺻
	public SaleCar() {}

	//2) �� ����, �� �⺻
	public SaleCar(int door) {
		this.door = door;
	}
	//3) �� �⺻, �� ����
	public SaleCar(String color) {
		this.color = color;
	}
	//4) �� ����, �� ����
	public SaleCar(int door, String color) {
		this.door = door;
		this.color = color;
	}
	
	
	void printAttr() {
//		System.out.println("�� �̸�: " + ??);
		System.out.println("�� ����: " + door);
		System.out.println("�� �� ����: " + color);
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
