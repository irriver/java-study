package quiz.money;

import java.util.Scanner;

public class MoneyUnit {
	int unit = 10000;
	int num = 0;
	static boolean switched;
	static int money;

	public static void main(String[] args) {
		
		Scanner inputMoney = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		 money = inputMoney.nextInt();
		 
		 System.out.println("입력된 금액은 " + money + "입니다.");
	 
//		 입력받은 금액을 만원 단위로 나눠서 화폐 매수 계산
//		 
//		 {
		 
//		 돈 = 547500원 -> 10000원 * 54, 5000원 * 1, 1000원 * 2, 500원 * 1
		 
//			 화폐 단위별 매수 출력
//			 	만약, 단위가 1장 초과면, 
//			 		입력받은 금액에서 만원 단위의 금액을 제함
//			 	****단위가 1장 이하면 멈춤 == 남은 금액이 최소 단위면 while 종료
//			 	
//			 	만약, 스위치 false면
//			 		화폐 단위 5000(10000 / 2)으로 재할당
//			 		스위치 true로 바꿈
//			 	화폐 단위 1000(5000 / 2)으로 재할당
//			 	스위치 false로 바꿈
//		 }

		}

}
