package quiz.pizza;

import java.util.Scanner;

public class RamPizza {
	// ------- 피자 멤버 필드 ------
	static String dough;
	static String topping;
	static String side;

//	------ 피자 생성자 함수 ------
	public RamPizza() {
		this(dough);
	}

	public RamPizza(String dough) {
		this(dough, topping);
	}

	public RamPizza(String dough, String topping) {
		this(dough, topping, side);
	}

	public RamPizza(String dough, String topping, String side) {
		this.dough = dough;
		this.topping = topping;
		this.side = side;
	}

	// 어차피 도우, 토핑, 사이드 셋 다 3~4개 중 하나만 선택해야 하니까
	// 1 ~4 중 하나의 정수를 사용자에게 입력받는 메소드를 만들자
	int selectionLoop(int userSelect) {
		int result = 0;
		while (true) {
			if (1 <= userSelect && userSelect <= 4) {
				result = userSelect;
				break;
			}
			System.out.println("1 2 3 4 중 하나만 선택해주세요");
			continue;
		}
		return result;
	}

	void selectPizzaPart(int processNum) {
		switch (selectionLoop(processNum)) {
		case 1:
			selectDough();
			break;
		case 2:
			selectTopping();
			break;
		case 3:
			selectSide();
			break;
		default:
			System.out.println("???");
		}
	}

//	------ 피자 속성 선택 함수들 ------

	String selectDough() {
		return dough;
	}

	String selectTopping() {
		return topping;
	}

	String selectSide() {
		return side;
	}

//	------ 피자 속성 조함 함수 ------
	void combinePizza(String dough, String topping, String side) {
		System.out.printf("주문하신 %s %s %s 피자 나왔습니다.", dough, topping, side);
	}
}
