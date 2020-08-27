package quiz.hashmap.book;

public class Book {
	private final String ISBN;
	private String title;
	private int price;
	
	public Book(String iSBN, String title, int price) {
		ISBN = iSBN;
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getISBN() {
		return ISBN;
	}

	@Override
	public String toString() {
		return String.format("ISBN: %s 도서명: %s 도서정가: %d", ISBN, title, price);
	}
}
