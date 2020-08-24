package quiz.polymorphism;

class Tv extends Electronics {
	public Tv(int price) {
		super(price);
	}
	@Override
	public String toString() {
		return "Tv $" + this.price;
	}
	
}

class Audio extends Electronics {
	public Audio(int price) {
		super(price);
	}
	@Override
	public String toString() {
		return "Audio $" + this.price;
	}
	
}

class Computer extends Electronics {
	public Computer(int price) {
		super(price);
	}
	@Override
	public String toString() {
		return "Computer $" + this.price;
	}
}

class MacPro extends Electronics {
	public MacPro(int price) {
		super(price);
	}
	@Override
	public String toString() {
		return "MacPro $" + this.price;
	}
}
public class Electronics {
	int price;
	float point;

	public Electronics() {}
	
	public Electronics(int price) {
		this.price = price;
		this.point = (float) (this.price * 0.05);
	}
}
