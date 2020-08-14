package quiz.composite;

public class Computer {
	
	//���� �ٵ�� ������ �ʵ�
	private static int price;
	private static String brand;
	private static String serialNo;
	
	private String color;
	private boolean saveMode;
	
	private MainBody body;
	private KeyBoard key;
	private Monitor monitor;
	
	public Computer(MainBody body, KeyBoard key, Monitor monitor) {
		this.body = body;
		this.key = key;
		this.monitor = monitor;
	}
	
	
}
