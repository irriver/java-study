package scope;

public class Card {
	private int number;
	private String kind;
	
	private static int height = 70;
	private static int width = 50;
	
	public void cardInfo() {
		System.out.printf(
				"Card#: %d\n Kind: %s\n Height: %d\n Width: %d\n",
				number, kind, height, width);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
}
