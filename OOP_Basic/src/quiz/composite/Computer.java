package quiz_class;

/*
 * 	static 변수도 private 이라면 setter, getter로 사용해야 하나?
 */
public class Computer {
	private static int price;
	private static String brand;
	private static String serialNo;
	
	private String color;
	private boolean saveMode;
	
	private MainBody body;
	public KeyBoard key;
	public Monitor monitor;
	
	public Computer(MainBody body, KeyBoard key, Monitor monitor) {
		this.body = body;
		this.key = key;
		this.monitor = monitor;
	}
	
	
//	class Emp의 멤버인 class BodyInfo 역시 인스턴스화가 필요
//	BodyInfo bodyRef = new BodyInfo();
//	bodyRef.height = 190;
//	bodyRef.weight = 40;
//	
//	
////	서로 다른 객체를 연결!!!	>>	*참조변수 없이도 연결 가능
//	emp.bodyInfo = bodyRef;
	
}
