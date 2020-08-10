package assignment;

import java.util.Scanner;

public class Team_2 {
	public static void main(String[] args) {

//1) 1부터 20까지의  정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
		// 1 5 7 11 13 17 19 
		int total = 0;
		for (int k = 1; k <= 20; k++) {
			if (k % 2 == 0 || k % 3 == 0) {
				continue;
			}
			total = total + k;
		}
		System.out.println(total);
		
//2) 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
		
		for (int first = 1; first <= 6; first++) {
			for (int second = 1; second <= 6; second++) {
				if (first + second == 6) {
					System.out.printf("%d %d", first, second);
				}
			}
			System.out.println();
		}
//3) 3. 가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)
//컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요
//( 예를 들면 : 가위=> 1   , 바위 => 2  , 보 => 3)
		Scanner sc = new Scanner(System.in);
		int userRPS = 0;
		int comRPS = 0;
		String result = "";
		
		System.out.println("1.가위  2.바위  3.보 를 선택하세요>> ");
		userRPS = Integer.parseInt(sc.nextLine());
		comRPS = (int) ((Math.random() * 3) + 1);

		if (userRPS > comRPS) {
			
			 if(userRPS==3&&comRPS==1) result = "loose!";
			 else result="win!";
		} 
		else if(comRPS > userRPS) {
			 if(comRPS==3&&userRPS==1) result="win!";
			 else result="loose!";			
			 }
		else result="drow!";
		System.out.println("컴퓨터가 " + comRPS + " 를 냈습니다." + result);
	}
}
