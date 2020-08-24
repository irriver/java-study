package quiz.pizza;

import java.util.Scanner;

public class RamPizza {
	// ------- ���� ��� �ʵ� ------
	static String dough;
	static String topping;
	static String side;

//	------ ���� ������ �Լ� ------
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

	// ������ ����, ����, ���̵� �� �� 3~4�� �� �ϳ��� �����ؾ� �ϴϱ�
	// 1 ~4 �� �ϳ��� ������ ����ڿ��� �Է¹޴� �޼ҵ带 ������
	int selectionLoop(int userSelect) {
		int result = 0;
		while (true) {
			if (1 <= userSelect && userSelect <= 4) {
				result = userSelect;
				break;
			}
			System.out.println("1 2 3 4 �� �ϳ��� �������ּ���");
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

//	------ ���� �Ӽ� ���� �Լ��� ------

	String selectDough() {
		return dough;
	}

	String selectTopping() {
		return topping;
	}

	String selectSide() {
		return side;
	}

//	------ ���� �Ӽ� ���� �Լ� ------
	void combinePizza(String dough, String topping, String side) {
		System.out.printf("�ֹ��Ͻ� %s %s %s ���� ���Խ��ϴ�.", dough, topping, side);
	}
}
