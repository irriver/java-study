package quiz.constructor;

public class Book {
	private String bookName;
	private int bookPrice;
	
	public Book(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	//setter 메소드를 만들지 않은 것은 요구사항에 "출판된 이후에 도서명과 가격을 수정하지 말 것" 있기 때문에
	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	
	public static void main(String[] args) {
		Book b1 = new Book("Alice in WonderLand", 50000);
		Book b2 = new Book("Bible", 10000);
		Book b3 = new Book("Pride and Prejudice", 30000);
		
		System.out.println(b1.getBookName());
		System.out.println(b1.getBookPrice());
		System.out.println();

		System.out.println(b2.getBookName());
		System.out.println(b2.getBookPrice());
		System.out.println();
		
		System.out.println(b3.getBookName());
		System.out.println(b3.getBookPrice());
		System.out.println();
	}
}
