package lecture.this_method;

/*
 * 	��ü �ڽ��� ����Ű�� this ������ ������ �ּҸ� ���� ���̶�� ����
 * 	this ��ü �ڽ� ��Ģ: �������� ������ ȣ��
 * 
 * 	�������� ����: ��� �ʵ��� �ʱ�ȭ	>>	i�� x�� �����ϸ� '������'�� ������	>>	�Ű��������� ����ʵ�� ������	>>	�Ȱ����� �򰥸���
 * 	this.[����ʵ��] = �Ű�����;	�� ���
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
