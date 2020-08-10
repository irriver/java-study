import java.util.Scanner;

public class Ex10_Statement2 {
	public static void main(String[] args) {
		//while / do...while()
//		int i = 10;
//		while (i >= 10) {
//			i--;
//			System.out.println(i);
//		}
		
		//while로 구구단
		int dan = 2;
		int su;
		while (dan <= 9) {
			su = 1; //su가 10이 되면 다시 1로 초기화해서 사용
			while (su <= 9) {
				System.out.println(dan + "*" + su + "=" + dan * su);
				su++;
			}
			System.out.println();
			dan++;
		}
		
//		do { 실행문 } while (조건)
//		메뉴
//		1. 인사
//		2. 회계
//		선택하세요.
//		당신이 원하는 업무를 선택하세요 >> do {선택하세요..값을 받아서}
		Scanner sc = new Scanner(System.in);
		int inputData = 0;
		do {
			System.out.println("0~9 숫자만 입력");
			inputData = Integer.parseInt(sc.nextLine());
		} while (inputData >= 10); //while 조건이 참이면, do를 계속 실행함 -> 조건이 거짓일 때, 탈출
		System.out.println("당신이 입력한 숫자는 : " + inputData);
	}
	
}
