package lecture.static_members;

import java.util.Scanner;

public class Menu {
	// 상단 ... 일반 ... 변수 (고유, 상태 , 부품(참조:클래스))
	Scanner sc = new Scanner(System.in); // 부품(참조:클래스)

	// 기능
	void inputRecord() {
		System.out.println("성적데이터 입력 :");
	}

	void deleteRecord() {
		System.out.println("성적데이터 삭제 :");
	}

	void sortRecord() {
		System.out.println("성적데이터 정렬 :");
	}

	//	선택지 보여주는 메소드
	int displayMenu() {
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

		int menu = 0;
		do {
			try {
					
				//	메뉴 1 ~ 4 선택해서 담기
				menu = Integer.parseInt(sc.nextLine());
				
				//	선택된 메뉴가 선택지 내의 것인지 확인
				if (menu >= 1 && menu <= 4) {
					//	1 ~ 4 중 선택하면 선택값 반환
					break;
				} else {
					//	1 ~ 4 외의 번호 선택 시 예외 처리
					throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("메뉴 선택 문제 발생");
				System.out.println("메뉴 1~4번까지 입력");
			}
		} while (true);
		// 실행 : 사용자가 1 ~ 4까지 번호중에서 하나를 선택
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
				System.out.println("프로그램 종료");
				// return; //main 종료
				System.exit(0); // 프로그램 강제 종료 (kill)
			}
		}
	}

}
