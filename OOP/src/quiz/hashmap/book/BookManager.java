package quiz.hashmap.book;

import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	
	HashMap<String, Book> bookDic = new HashMap<String, Book>();
	
	public void run() {
		int key = 0;
		while ((key = selectMenu()) > 0) {
			switch (key) {
			case 1: addBook();		break;
			case 2: removeBook();	break;
			case 3: searchBook();	break;
			case 4: listBook();		break;
			case 5: System.out.println("프로그램 종료합니다."); System.exit(0);
			default: System.out.println("선택 오류");	break;
			}
			
		}
	}
//------------------------------
	
	public void listISBN() {
		System.out.println("--- ISBN 목록 ---");
		System.out.println("보유 도서 수: " + bookDic.size());
		for (String iSBN : bookDic.keySet()) {
			System.out.println(iSBN);
		}
	}

	public void listBook() {
		System.out.println("--- 도서 목록 ---");
		System.out.println("보유 도서 수: " + bookDic.size());
		for (Book item : bookDic.values()) {
			System.out.println(item.toString());
		}
	}

	public void searchBook() {
		String iSBN = getISBN();
		if (isExist(iSBN)) {
			System.out.println(bookDic.get(iSBN).toString());
		} else {
			System.out.println("검색하신 도서가 목록에 없습니다.");
		}
	}

	public void removeBook() {
		System.out.println("삭제할 도서의 ISBN을 입력하세요 >> ");
		String iSBN = getISBN();
		if (isExist(iSBN)) {
			bookDic.remove(iSBN);
			System.out.println("해당 도서를 목록에서 삭제했습니다.");
		} else {
			System.out.println("해당 도서가 존재하지 않습니다.");
		}
	}

	public void addBook() {
		String iSBN = getISBN();
		if (!isExist(iSBN)) {
			System.out.println("추가할 도서명 입력 >> ");
			String title = scan.nextLine();
			System.out.println("추가할 도서 정가 입력 >> ");
			int price = scan.nextInt();
			
			Book newBook = new Book(iSBN, title, price);
			bookDic.put(iSBN, newBook);
			System.out.println(newBook.toString() + "\n해당 도서를 추가했습니다.");
		}
	}
	
	public boolean isExist(String newISBN) {
		//넘겨받은 isbn이 있을 때
		if (bookDic.containsKey(newISBN)) {
			return true;
		}
		//넘겨받은 isbn이 없을 때
		System.out.println("입력하신 ISBN이 존재하지 않습니다.");
		return false;
	}
	
	public String getISBN() {
		System.out.println("도서의 ISBN을 입력하세요 >> ");
		String iSBN = scan.nextLine();
		return iSBN;
	}

	public int selectMenu() {
		System.out.println("1) 도서추가\t2) 도서 삭제\t3) 도서 검색\n4) ISBN목록\t5) 종료");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}
}
