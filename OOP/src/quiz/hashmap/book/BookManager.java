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
			case 5: System.out.println("���α׷� �����մϴ�."); System.exit(0);
			default: System.out.println("���� ����");	break;
			}
			
		}
	}
//------------------------------
	
	public void listISBN() {
		System.out.println("--- ISBN ��� ---");
		System.out.println("���� ���� ��: " + bookDic.size());
		for (String iSBN : bookDic.keySet()) {
			System.out.println(iSBN);
		}
	}

	public void listBook() {
		System.out.println("--- ���� ��� ---");
		System.out.println("���� ���� ��: " + bookDic.size());
		for (Book item : bookDic.values()) {
			System.out.println(item.toString());
		}
	}

	public void searchBook() {
		String iSBN = getISBN();
		if (isExist(iSBN)) {
			System.out.println(bookDic.get(iSBN).toString());
		} else {
			System.out.println("�˻��Ͻ� ������ ��Ͽ� �����ϴ�.");
		}
	}

	public void removeBook() {
		System.out.println("������ ������ ISBN�� �Է��ϼ��� >> ");
		String iSBN = getISBN();
		if (isExist(iSBN)) {
			bookDic.remove(iSBN);
			System.out.println("�ش� ������ ��Ͽ��� �����߽��ϴ�.");
		} else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}

	public void addBook() {
		String iSBN = getISBN();
		if (!isExist(iSBN)) {
			System.out.println("�߰��� ������ �Է� >> ");
			String title = scan.nextLine();
			System.out.println("�߰��� ���� ���� �Է� >> ");
			int price = scan.nextInt();
			
			Book newBook = new Book(iSBN, title, price);
			bookDic.put(iSBN, newBook);
			System.out.println(newBook.toString() + "\n�ش� ������ �߰��߽��ϴ�.");
		}
	}
	
	public boolean isExist(String newISBN) {
		//�Ѱܹ��� isbn�� ���� ��
		if (bookDic.containsKey(newISBN)) {
			return true;
		}
		//�Ѱܹ��� isbn�� ���� ��
		System.out.println("�Է��Ͻ� ISBN�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public String getISBN() {
		System.out.println("������ ISBN�� �Է��ϼ��� >> ");
		String iSBN = scan.nextLine();
		return iSBN;
	}

	public int selectMenu() {
		System.out.println("1) �����߰�\t2) ���� ����\t3) ���� �˻�\n4) ISBN���\t5) ����");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}
}
