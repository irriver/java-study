package static_members;

import java.util.Scanner;

public class Lunch {
	Scanner sc = new Scanner(System.in);
	static boolean isSelected = false;

	void serveChicken() {
		System.out.println("�ֹ��Ͻ� '��Ƽ���� ġŲ'���Խ��ϴ�. ����!");
	}

	void serveSubClub() {
		System.out.println("�ֹ��Ͻ� '��Ƽ���� ġŲ'���Խ��ϴ�. ����!");
	}

	void serveAvocado() {
		System.out.println("�ֹ��Ͻ� '������ �ƺ�ī��'���Խ��ϴ�. ����!");
	}

	int displayMenu() {
		System.out.println("**** ���� �޴� ���� ****");
		System.out.println("1. ��Ƽ���� ġŲ");
		System.out.println();
		System.out.println("2. ������ Ŭ��");
		System.out.println();
		System.out.println("3. ������ �ƺ�ī��");
		System.out.println();
		System.out.println("4. ���� ���� �н�-!");
		System.out.println();

		int menu = 0;
		do {
			try {

				menu = Integer.parseInt(sc.nextLine());

				if (menu >= 1 && menu <= 4) {
					isSelected = true;
					break;
				} else {
					throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("�޴� ���� ���� �߻�");
				System.out.println("�޴� 1~4������ �Է�");
			}
		} while (true);
		return menu;
	}

	public static void main(String[] args) {
		Lunch menu = new Lunch();
		while (!isSelected) {
			switch (menu.displayMenu()) {
			case 1:
				menu.serveChicken();
				break;
			case 2:
				menu.serveSubClub();
				break;
			case 3:
				menu.serveAvocado();
				break;
			case 4:
				System.out.println("���߿� ����� ���� �־��. �׷� �ȳ�-!");
				System.exit(0);
			}
		}
	}

}
