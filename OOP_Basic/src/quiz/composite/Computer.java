package quiz_class;

/*
 * 	static ������ private �̶�� setter, getter�� ����ؾ� �ϳ�?
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
	
	
//	class Emp�� ����� class BodyInfo ���� �ν��Ͻ�ȭ�� �ʿ�
//	BodyInfo bodyRef = new BodyInfo();
//	bodyRef.height = 190;
//	bodyRef.weight = 40;
//	
//	
////	���� �ٸ� ��ü�� ����!!!	>>	*�������� ���̵� ���� ����
//	emp.bodyInfo = bodyRef;
	
}
