package lecture.this_method;

/*
 * 	객체 자신을 가리키는 this 앞으로 생성될 주소를 담을 곳이라고 가정
 * 	this 객체 자신 원칙: 여러개의 생성자 호출
 * 
 * 	생성자의 목적: 멤버 필드의 초기화	>>	i에 x를 대입하면 '가독성'이 떨어져	>>	매개변수명을 멤버필드와 맞추자	>>	똑같으니 헷갈리네
 * 	this.[멤버필드명] = 매개변수;	로 사용
 */

class Test {
	int i = 0;
	int j = 0;

	Test() {
	}

	Test(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

class Book {
	String bookName;

	public Book() {
	}

	public Book(String bookName) {
		this.bookName = bookName;
	}
}

public class This {
	public static void main(String[] args) {
		Test t = new Test(10, 20);
		System.out.println(t.i + t.j);

		Book novel = new Book("Wuthering Heights");
		System.out.println(novel.bookName);
	}
}
