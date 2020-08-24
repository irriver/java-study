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
		System.out.println("���� �� ���� �ܰ�: $" + this.budget);
		System.out.println(elecs.toString() + "�� �����մϴ�...");
		this.budget -= elecs.price;
		System.out.println("���� �� ���� �ܰ�: $" + this.budget);
		if (this.budget < elecs.price) {
			System.out.println("�ܾ� " + (elecs.price - this.budget) + " ����\n");
			return;
		}
	}

	
}
