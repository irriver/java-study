package quiz.pizza;

import java.util.Scanner;

public class PizzaPart {
	private String dough;
	private String topping1;
	private String topping2;
	private String side;
	private int choiceNum;

	private String[] doughs = new String[] { "��", "��", "��" };
	private String[] toppings = new String[] { "������", "ġŲ", "�Ұ��", "������ũ" };
	private String[] sides = new String[] { "�����ݶ�", "���ȷ���", "���İ�Ƽ" };

	public void setDough(Scanner userInput) {
		do {
			System.out.println("---- ���� ���� ----");
			System.out.println("1)��\t2)��\t3)��");
			choiceNum = userInput.nextInt();
			
			if (1 <= choiceNum && choiceNum <= 3) {
				dough = doughs[choiceNum - 1];
				return;
			} else continue;
		} while (true);
	}

	public void setTopping1(Scanner userInput) {
		do {
			System.out.println("---- ����1 ���� ----");
			System.out.println("1)������\t2)ġŲ \t3)�Ұ��\t4)������ũ");
			choiceNum = userInput.nextInt();

			if (1 <= choiceNum && choiceNum <= 4) {
				topping1 = toppings[choiceNum - 1];
				return;
			} else continue;
		} while (true);
	}
	
	public void setTopping2(Scanner userInput) {
		String[] ret = removeItem(choiceNum - 1);
		do {
			System.out.println("---- ����2 ���� ----");
			showTopping2(ret);
			choiceNum = userInput.nextInt();

			if (1 <= choiceNum && choiceNum <= 4) {
				topping2 = toppings[choiceNum];
				return;
			} else continue;
		} while (true);
	}

	public void setSide(Scanner userInput) {
		do {
			System.out.println("--- ���̵� �޴� ---");
			System.out.println("1)�����ݶ�\t2)���ȷ���\t3)���İ�Ƽ");
			choiceNum = userInput.nextInt();

			if (1 <= choiceNum && choiceNum <= 3) {
				side = sides[choiceNum - 1];
				return;
			} else continue;
		} while (true);
	}
	
	public String[] removeItem(int idx) {
		String[] src = toppings;
		String[] dest = new String[src.length - 1];
		for (int i = 0; i < idx; i++) {
			dest[i] = src[i];
		}
		for (int i = idx; i < dest.length; i++) {
			dest[i] = src[i + 1];
		}
		return dest;
	}
	
	public void showTopping2(String[] items) {
		int i = 0;
		for (String item : items) {
			System.out.print(++i+ ")" + item + "\t");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "�ֹ��Ͻ�  " + dough + " ����, " + topping1 + ", " + topping2 + " �߰���  ���ڿ� " + side + " ���Խ��ϴ�!";
	}

}
