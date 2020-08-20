package quiz.pizza;

import java.util.Scanner;

public class Pizza {
	private String dough;
	private String topping1;
	private String topping2;
	private String side;
	private int choiceNum;

	private String[] doughs = new String[] { "쌀", "밀", "씬" };
	private String[] toppings = new String[] { "베이컨", "치킨", "불고기", "스테이크" };
	private String[] sides = new String[] { "제로콜라", "버팔로윙", "스파게티" };

	public String[] modifyItems(int idx) {
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
	
	public void showItems(String[] items) {
		int i = 0;
		for (String item : items) {
			System.out.print(++i+ ")" + item + "\t");
		}
		System.out.println();
	}
	
	public void setDough(Scanner userInput) {
		do {
			System.out.println("---- 도우 선택 ----");
			showItems(doughs);
			choiceNum = userInput.nextInt();
			
			if (1 <= choiceNum && choiceNum <= doughs.length) {
				dough = doughs[choiceNum - 1];
				return;
			}
		} while (true);
	}

	public void setTopping1(Scanner userInput) {
		do {
			System.out.println("---- 토핑1 선택 ----");
			showItems(toppings);
			choiceNum = userInput.nextInt();

			if (1 <= choiceNum && choiceNum <= toppings.length) {
				topping1 = toppings[choiceNum - 1];
				return;
			}
		} while (true);
	}
	
	public void setTopping2(Scanner userInput) {
		String[] toppings2 = modifyItems(choiceNum - 1);
		do {
			System.out.println("---- 토핑2 선택 ----");
			showItems(toppings2);
			choiceNum = userInput.nextInt();

			if (1 <= choiceNum && choiceNum <= toppings2.length) {
				topping2 = toppings2[choiceNum - 1];
				return;
			}
		} while (true);
	}

	public void setSide(Scanner userInput) {
		do {
			System.out.println("--- 사이드 메뉴 ---");
			showItems(sides);
			choiceNum = userInput.nextInt();

			if (1 <= choiceNum && choiceNum <= sides.length) {
				side = sides[choiceNum - 1];
				return;
			}
		} while (true);
	}
	
	@Override
	public String toString() {
		return "주문하신  " + dough + " 도우, " + topping1 + ", " + topping2 + " 추가한  피자에 " + side + " 나왔습니다!";
	}
}
