package static_members;

import java.util.Scanner;

public class Lunch {
	Scanner sc = new Scanner(System.in);
	static boolean isSelected = false;

	void serveChicken() {
		System.out.println("주문하신 '로티세리 치킨'나왔습니다. 맛점!");
	}

	void serveSubClub() {
		System.out.println("주문하신 '로티세리 치킨'나왔습니다. 맛점!");
	}

	void serveAvocado() {
		System.out.println("주문하신 '쉬림프 아보카도'나왔습니다. 맛점!");
	}

	int displayMenu() {
		System.out.println("**** 점심 메뉴 고르기 ****");
		System.out.println("1. 로티세리 치킨");
		System.out.println();
		System.out.println("2. 써브웨이 클럽");
		System.out.println();
		System.out.println("3. 쉬림프 아보카도");
		System.out.println();
		System.out.println("4. 오늘 점심 패스-!");
		System.out.println();

		int menu = 0;
		do {
			try {

				menu = Integer.parseInt(sc.nextLine());

				if (menu >= 1 && menu <= 4) {
					isSelected = true;
					break;
				} else {
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println("메뉴 1~4번까지 입력");
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
				System.out.println("나중에 배고플 수도 있어요. 그럼 안녕-!");
				System.exit(0);
			}
		}
	}

}
