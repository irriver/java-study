import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
//		}
//		System.out.println("sum: " + sum);
//		
//		//1 ~ 5
//		// n * (begin + end) / 2
//		//공식 사용이 빠르긴 해
//		sum = count * (begin + end) / 2;
//		
//		// for문만 사용해서 1~10까지의 홀수 값 합을 구해
//		int sum = 0;
//		for (int i = 1; i <= 10; i = i + 2) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//
//		int sum2 = 0;
//		int begin = 1;
//		int end = 100;
//		int count = 100;
//		sum2 = count * (begin + end) / 2;
//		System.out.println("공식 사용한 합: " + sum2);
//		
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		//분기문: continue(자기 아래의 구문을 skip), break(블럭 탈출, 함수탈출은 아님)

//		for (int i = 10; i >= 0; i--) {
//			for (int j = 1; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//fibonacci
		System.out.println("정수 n 입력>> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fiboNum = fibonacci(n);
		printFibo(n, fiboNum);
	}

	private static void printFibo(int n, int fiboNum) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < fiboNum; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static int fibonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return (fibonacci(n - 1) + fibonacci(n - 2));
	}
}
