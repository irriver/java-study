package quiz.arrayList;

import java.util.ArrayList;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount("100", "Bill Gates");
		bank.addAccount("200", "Donald Trump");
		bank.addAccount("300", "Jane");
		
		//���� ����� �ѹ� ����غ���
//		bank.getAccounts();
		
		//������������ 100�� �Ա�
		bank.getAccount("100").deposit(100);
		bank.showAccount("100");
		//������������ 100�� ���
		bank.getAccount("100").withdraw(100);
		bank.showAccount("100");
		bank.getAccount("100").withdraw(100);
		bank.showAccount("100");
		
		//�� ���� ���¼� Ȯ��
		System.out.println("�� ���� ���� �� " + bank.getTotalAccount());
		System.out.println();
		
		//�̸����� ���� Ȯ�� (�� �̸� �ߺ� üũ ����)
		
		//'�ŷ� ����'�� ����غ���
		ArrayList<Transaction> ret = bank.getAccount("100").getTransactions();
		for (Transaction result : ret) {
			System.out.println(result.toString());
		}
	}
}
