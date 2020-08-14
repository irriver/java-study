package this_method;

public class SoCar {
	String color;
	String gearType;
	int door;
	
	//SoCar의 기본설정을 세팅
	public SoCar() {
		this.color = "RED";
		this.gearType = "Auto";
		this.door = 2;
	}
	
	SoCar(String color, String gearType, int door) {
		this.color =color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void printAttr() {
		System.out.println(this.color);
		System.out.println(this.gearType);
		System.out.println(this.door);
	}
	
	public static void main(String[] args) {
		SoCar car = new SoCar();
		car.printAttr();
		
		SoCar car2 = new SoCar("BLACK", "Auto", 4);
		car2.printAttr();
	}
}
