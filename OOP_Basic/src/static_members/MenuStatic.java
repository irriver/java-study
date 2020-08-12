package static_members;

import java.util.Scanner;

public class MenuStatic {
	 static Scanner sc = new Scanner(System.in);

	static void inputRecord() {
		System.out.println("성적데이터 입력 :");
	}

	static void deleteRecord() {
		System.out.println("성적데이터 삭제 :");
	}

	static void sortRecord() {
		System.out.println("성적데이터 정렬 :");
	}

	static int displayMenu() {
		System.out.println("***************");
		System.out.println("****성적 관리****");
		System.out.println("1. 학생성적 입력하기");
		System.out.println();
		System.out.println("2. 학생성적 삭제하기");
		System.out.println();
		System.out.println("3. 학생성적 이름순 정렬하기");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();

//		*** 함수 안의 변수는 static, instance 상관 없음
		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 4) {
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
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}

}
