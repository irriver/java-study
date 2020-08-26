package quiz.arrayList;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	//transaction 객체 생성 시 '입출금 여부kind', 'amount', 'balance'를 강제로 받아서 넣을 것. 
	public Transaction(String kind, long amount, long balance) {
		this.transactionDate = LocalDate.now().toString();
		this.transactionTime =  LocalTime.now().toString();
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "--- 거래내역 ---\n [거래금액: " + amount + "잔액: " + balance + "\n거래일자: " + transactionDate + "\n거래시간: " + transactionTime;
	}
}
