
public class Ex04_Switch {
	public static void main(String[] args) {
		
	int data = 90;
	switch(data) {
		case 100:
			System.out.println("100 �Դϴ�");
			break;
		case 90:
			System.out.println("90�Դϴ�");
			break;
		case 80:
			System.out.println("80�Դϴ�");
			break;
		case 70:
			System.out.println("90�Դϴ�");
			break;
		default:
			System.out.println("default");
			break;
			
		}
	
	System.out.println("Math.random: " + Math.random());
	System.out.println("1���� 10���� ����: " + (int)(Math.random() * 10 + 1));
	}
}
