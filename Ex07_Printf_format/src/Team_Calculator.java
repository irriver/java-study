import java.util.Scanner;

public class Team_Calculator {
	
	private static int calc(int num1, String operator, int num2) {
		int result = 0;
		
		if (operator.equals("+")) {
			result = num1 + num2;
		}
		else if (operator.equals("-")) {
			result = num1 - num2;
		}
		else if (operator.equals("*")) {
			result = num1 * num2;
		}
		else if (operator.equals("/")) {
			result = num1 / num2;
		}
		else {
			System.out.println("�Էµ� �����ڰ� ���� �ʽ��ϴ�. + - * / �� �ϳ��� �����ϼ���.");
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("�Է°�1 >> ");
		Scanner sc = new Scanner(System.in);
		int inputNum1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("�Է°�(��ȣ) >> ");
		String operator = sc.nextLine();
		
		System.out.println("�Է°�2 >> ");
		int inputNum2 = Integer.parseInt(sc.nextLine());
		
		int output = calc(inputNum1, operator, inputNum2);
		
		System.out.println("������ >> " + output);
	}
}
