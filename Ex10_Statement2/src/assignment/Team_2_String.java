package assignment;

import java.util.Scanner;

public class Team_2_String {
	public static void main(String[] args) {

//1) 1부터 20까지의  정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요

//2) 두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
		
//3) 3. 가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)
//컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요
//( 예를 들면 : 가위=> 1   , 바위 => 2  , 보 => 3)
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.println("가위  바위  보 를 선택하세요>> ");
		String userInput = sc.nextLine();
		int userRPS = 0;
		if (userInput.equals("가위")) userRPS = 1;
		if (userInput.equals("바위")) userRPS = 2;
		if (userInput.equals("가위")) userRPS = 3;

		int comRPS = (int) ((Math.random() * 3) + 1);
/*  나        컴
 *  1가위 : 1가위 draw
 *        2바위 loose
 *        3보   win
 *  2바위 : 1가위 win
 *        2바위 draw
 *        3보   loose
 *  3보:   1가위 loose
 *        2바위 win
 *        3보   draw
 * */
		if (userRPS == 1) {
			if (comRPS == 1) result = "draw!";
			else if (comRPS == 2) result = "loose!";
			else result = "win!";
		}
		if (userRPS == 2) {
			if (comRPS == 1) result = "win!";
			else if (comRPS == 2) result = "draw!";
			else result = "loose!";
		}
		if (userRPS == 3) {
			if (comRPS == 1) result = "loose!";
			else if (comRPS == 2) result = "win!";
			else result = "draw!";
		}
		System.out.println("컴퓨터가 " + comRPS + "를 냈습니다." + result);
	}
}
