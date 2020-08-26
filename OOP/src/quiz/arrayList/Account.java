package quiz.arrayList;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;	//잔고
	private ArrayList<Transaction> transactions;
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}
	
	//계좌번호 조회
	public String getAccountNo() {
		return this.accountNo;
	}
	
	//계좌이름 조회
	public String getName() {
		return name;
	}
	
	//입금
	public void deposit(long amount) {
		//transaction의 kind에 표기"입금"
		this.balance += amount;
		setTransactions("입금", +amount, this.balance);
	}
	
	//출금
	public void withdraw(long amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			setTransactions("출금", -amount, this.balance);
		} else {
			System.out.println("--- 승인거절: 잔고 부족 ! ---");
			System.out.println(" >> 잔액이 " + (balance - amount) + "원 부족합니다.");
		}
	}
	
	//잔고 확인
	public long getBalance() {
		return balance;
	}
	
	//거래내역 입력
	public ArrayList<Transaction> setTransactions(String kind, long amount, long balance) {
		this.transactions.add(new Transaction(kind, amount, balance));
		return transactions;
	}
	
	//거래 내역 조회
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	@Override
	public String toString() {
		return "--- 해당 계좌번호의 계좌 정보 ---\n [계좌번호: " + accountNo + ", 소유자명: " + name + ", 잔액: " + balance + "]";
	}
}
