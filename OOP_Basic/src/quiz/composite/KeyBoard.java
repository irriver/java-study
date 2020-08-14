package quiz.composite;

import java.util.Scanner;

public class KeyBoard {
	private String button;
	private boolean Led;
	private String brand;

	// �Է� �ް�
	public String input() {
		String word = "";
		Scanner sc = new Scanner(System.in);
		while (sc.next() != null) {
			word += sc;
		}
		return word;
	}

	// ����ϱ�
	public void output(String input) {
			System.out.println(input);
		}
}
