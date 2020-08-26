package quiz.arrayList;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;	//�ܰ�
	private ArrayList<Transaction> transactions;
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList<Transaction>();
	}
	
	//���¹�ȣ ��ȸ
	public String getAccountNo() {
		return this.accountNo;
	}
	
	//�����̸� ��ȸ
	public String getName() {
		return name;
	}
	
	//�Ա�
	public void deposit(long amount) {
		//transaction�� kind�� ǥ��"�Ա�"
		this.balance += amount;
		setTransactions("�Ա�", +amount, this.balance);
	}
	
	//���
	public void withdraw(long amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			setTransactions("���", -amount, this.balance);
		} else {
			System.out.println("--- ���ΰ���: �ܰ� ���� ! ---");
			System.out.println(" >> �ܾ��� " + (balance - amount) + "�� �����մϴ�.");
		}
	}
	
	//�ܰ� Ȯ��
	public long getBalance() {
		return balance;
	}
	
	//�ŷ����� �Է�
	public ArrayList<Transaction> setTransactions(String kind, long amount, long balance) {
		this.transactions.add(new Transaction(kind, amount, balance));
		return transactions;
	}
	
	//�ŷ� ���� ��ȸ
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	@Override
	public String toString() {
		return "--- �ش� ���¹�ȣ�� ���� ���� ---\n [���¹�ȣ: " + accountNo + ", �����ڸ�: " + name + ", �ܾ�: " + balance + "]";
	}
}
