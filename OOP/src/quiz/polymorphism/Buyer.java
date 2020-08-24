package quiz.polymorphism;

public class Buyer {
	int budget = 100000;
	float myPoint;

	public Buyer() {}
	public Buyer(int budget) {
		this.budget = budget;
	}
/*	
	 [Buy function] budget = budget - price myPoint = myPoint + point
	 *** Buyers can buy all Electronics ***
*/	 
	void buy(Electronics elecs) {
		this.myPoint += elecs.point;
		System.out.println("구입 전 현재 잔고: $" + this.budget);
		System.out.println(elecs.toString() + "을 구입합니다...");
		this.budget -= elecs.price;
		System.out.println("구입 후 현재 잔고: $" + this.budget);
		if (this.budget < elecs.price) {
			System.out.println("잔액 " + (elecs.price - this.budget) + " 부족\n");
			return;
		}
	}

	
}
