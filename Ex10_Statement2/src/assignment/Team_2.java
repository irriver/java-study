package assignment;

import java.util.Scanner;

public class Team_2 {
	public static void main(String[] args) {

//1) 1���� 20������  ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		// 1 5 7 11 13 17 19 
		int total = 0;
		for (int k = 1; k <= 20; k++) {
			if (k % 2 == 0 || k % 3 == 0) {
				continue;
			}
			total = total + k;
		}
		System.out.println(total);
		
//2) �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		
		for (int first = 1; first <= 6; first++) {
			for (int second = 1; second <= 6; second++) {
				if (first + second == 6) {
					System.out.printf("%d %d", first, second);
				}
			}
			System.out.println();
		}
//3) 3. ���� , ���� ,�� ���� �� ����� ���ؼ� �ۼ��ϼ��� (IF)
//��ǻ�Ͱ� �ڵ����� ���� ���� , ���� , �� �� ���ؼ� ����ڰ� ���� �Է� �ؼ� ó�� �ϼ���
//( ���� ��� : ����=> 1   , ���� => 2  , �� => 3)
		Scanner sc = new Scanner(System.in);
		int userRPS = 0;
		int comRPS = 0;
		String result = "";
		
		System.out.println("1.����  2.����  3.�� �� �����ϼ���>> ");
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
		System.out.println("��ǻ�Ͱ� " + comRPS + " �� �½��ϴ�." + result);
	}
}
