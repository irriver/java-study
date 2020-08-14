package quiz.butcher;

public class Buyer {
	int buyerBudget;
	int orderNo;
	
	public Buyer(Seller seller, int orderNo) {
		Seller.noOfBeef -= orderNo;
	}
	
	void showbuyResult(Meat meat) {
		int beefResult = meat.getBeefPrice() * this.orderNo;
		int porkResult = meat.getPorkPrice() * this.orderNo;
		int lambResult = meat.getLambPrice() * this.orderNo;
		
		int totalOutcome = beefResult + porkResult + lambResult;
		System.out.println("총 지출은 " + totalOutcome +"입니다.");
	}
}
