package quiz.butcher;

public class Seller {
	private int sellerBudget = 500000;
	
	static int noOfBeef = 20;
	static int noOfPork = 10;
	static int noOfLamb = 5;
	
//	Q.��� �������� �Ǹ� �޼ҵ带 ���� ������ �ϳ�?
	void showSaleResult(Meat meat, Buyer buyer) {
		int orderNo = buyer.orderNo;
		
		int beefResult = meat.getBeefPrice() * orderNo;
		int porkResult = meat.getPorkPrice() * orderNo;
		int lambResult = meat.getLambPrice() * orderNo;
		
		int totalIncome = beefResult + porkResult + lambResult;
		this.sellerBudget += totalIncome;
		System.out.println("�� ������ " + totalIncome +"�Դϴ�.");
	}
	
}
