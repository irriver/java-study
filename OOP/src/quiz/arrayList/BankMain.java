package quiz.arrayList;

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
		
		//�̸����� ���� Ȯ�� (�� �̸� �ߺ� üũ ����)
		
	}
}
