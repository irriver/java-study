package assignment;

public class PrintStars {
	public static void main(String[] args) {

		// 1. 오른쪽으로 치우친 역삼각형
		int n = 8;
		for (int row = 0; row < n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("O");
			}
			for (int col = 1; col < n - row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");

		//2. 피라미드
		for (int row = 1; row < n; row++) {
			for (int col = n - row; col >= 0; col--) {
				System.out.print("O");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
