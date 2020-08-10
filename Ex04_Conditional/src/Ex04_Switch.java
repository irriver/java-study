
public class Ex04_Switch {
	public static void main(String[] args) {
		
	int data = 90;
	switch(data) {
		case 100:
			System.out.println("100 입니다");
			break;
		case 90:
			System.out.println("90입니다");
			break;
		case 80:
			System.out.println("80입니다");
			break;
		case 70:
			System.out.println("90입니다");
			break;
		default:
			System.out.println("default");
			break;
			
		}
	
	System.out.println("Math.random: " + Math.random());
	System.out.println("1부터 10까지 난수: " + (int)(Math.random() * 10 + 1));
	}
}
