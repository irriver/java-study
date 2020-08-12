package static_members;

import java.util.Scanner;

public class MenuStatic {
	 static Scanner sc = new Scanner(System.in);

	static void inputRecord() {
		System.out.println("���������� �Է� :");
	}

	static void deleteRecord() {
		System.out.println("���������� ���� :");
	}

	static void sortRecord() {
		System.out.println("���������� ���� :");
	}

	static int displayMenu() {
		System.out.println("***************");
		System.out.println("****���� ����****");
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2. �л����� �����ϱ�");
		System.out.println();
		System.out.println("3. �л����� �̸��� �����ϱ�");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		System.out.println();

//		*** �Լ� ���� ������ static, instance ��� ����
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4) {
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

		while (true) {
			switch (MenuStatic.displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				deleteRecord();
				break;
			case 3:
				sortRecord();
				break;
			case 4:
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
	}

}
