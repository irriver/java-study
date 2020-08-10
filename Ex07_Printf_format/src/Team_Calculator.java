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
			System.out.println("입력된 연산자가 옳지 않습니다. + - * / 중 하나를 선택하세요.");
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("입력값1 >> ");
		Scanner sc = new Scanner(System.in);
		int inputNum1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력값(기호) >> ");
		String operator = sc.nextLine();
		
		System.out.println("입력값2 >> ");
		int inputNum2 = Integer.parseInt(sc.nextLine());
		
		int output = calc(inputNum1, operator, inputNum2);
		
		System.out.println("연산결과 >> " + output);
	}
}
