package quiz.arrayList;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	//transaction ��ü ���� �� '����� ����kind', 'amount', 'balance'�� ������ �޾Ƽ� ���� ��. 
	public Transaction(String kind, long amount, long balance) {
		this.transactionDate = LocalDate.now().toString();
		this.transactionTime =  LocalTime.now().toString();
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "--- �ŷ����� ---\n [�ŷ��ݾ�: " + amount + "�ܾ�: " + balance + "\n�ŷ�����: " + transactionDate + "\n�ŷ��ð�: " + transactionTime;
	}
}
