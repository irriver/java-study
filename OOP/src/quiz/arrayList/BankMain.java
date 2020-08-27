package quiz.arrayList;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount("100", "Bill Gates");
		bank.addAccount("200", "Donald Trump");
		bank.addAccount("300", "Jane");
		
		//계좌 목록을 한번 출력해보자
//		bank.getAccounts();
		
		//빌게이츠에게 100원 입금
		bank.getAccount("100").deposit(100);
		bank.showAccount("100");
		//빌게이츠에게 100원 출금
		bank.getAccount("100").withdraw(100);
		bank.showAccount("100");
		bank.getAccount("100").withdraw(100);
		bank.showAccount("100");
		
		//총 개설 계좌수 확인
		System.out.println("총 개설 계좌 수 " + bank.getTotalAccount());
		
		//이름으로 계좌 확인 (단 이름 중복 체크 안함)
		
	}
}
