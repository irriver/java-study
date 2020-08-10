package assignment;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("----------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------");
			
			System.out.println("선택");
			int input = Integer.parseInt(sc.nextLine());
			int balance = 0;
			switch (input) {
			case 1:
				System.out.println("예금");
			}
		}
	}
}
