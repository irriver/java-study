package lecture.this_method;

class CoolCar {
	String color;
	String gearType;
	int door;

//	1)�����ڿ�  2)�����ڿ��� �ʵ� �ʱ�ȭ �ϴ� �κ��� ***�ݺ��Ǵ� ����
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
		CoolCar car = new CoolCar();	//1) �⺻������ ȣ�� - 2) �Ű����� 3���� ������ ��Ī - 3) ����: �Ű������� ���� ���� ����ʵ忡 �Ҵ� -  
		car.printAttr();
	}
}
