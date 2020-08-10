package assignment;

public class Assignment_2_garam {
	public static void main(String[] args) {

		printPyramid(5);
		printReverseTriangle(5);
	}

	private static void printPyramid(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print("O");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void printReverseTriangle(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 2 * (n - i); j >= 0; j--) {
				System.out.print("O");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
