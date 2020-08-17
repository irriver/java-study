package lecture.static_members;

import java.util.Scanner;

public class Menu {
	// ��� ... �Ϲ� ... ���� (����, ���� , ��ǰ(����:Ŭ����))
	Scanner sc = new Scanner(System.in); // ��ǰ(����:Ŭ����)

	// ���
	void inputRecord() {
		System.out.println("���������� �Է� :");
	}

	void deleteRecord() {
		System.out.println("���������� ���� :");
	}

	void sortRecord() {
		System.out.println("���������� ���� :");
	}

	//	������ �����ִ� �޼ҵ�
	int displayMenu() {
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

		int menu = 0;
		do {
			try {
					
				//	�޴� 1 ~ 4 �����ؼ� ���
				menu = Integer.parseInt(sc.nextLine());
				
				//	���õ� �޴��� ������ ���� ������ Ȯ��
				if (menu >= 1 && menu <= 4) {
					//	1 ~ 4 �� �����ϸ� ���ð� ��ȯ
					break;
				} else {
					//	1 ~ 4 ���� ��ȣ ���� �� ���� ó��
					throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("�޴� ���� ���� �߻�");
				System.out.println("�޴� 1~4������ �Է�");
			}
		} while (true);
		// ���� : ����ڰ� 1 ~ 4���� ��ȣ�߿��� �ϳ��� ����
		return menu;
	}

	public static void main(String[] args) {
		Menu menu = new Menu();

		while (true) {
			switch (menu.displayMenu()) {
			case 1:
				menu.inputRecord();
				break;
			case 2:
				menu.deleteRecord();
				break;
			case 3:
				menu.sortRecord();
				break;
			case 4:
				System.out.println("���α׷� ����");
				// return; //main ����
				System.exit(0); // ���α׷� ���� ���� (kill)
			}
		}
	}

}
