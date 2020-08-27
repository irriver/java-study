package quiz.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;
	private int totalAccount;

	public Bank() {
		this.accounts = new ArrayList<Account>();
		this.totalAccount = 0;
	}

	// ���� ���� �޼ҵ�***
	public void addAccount(String accountNo, String name) {
		this.accounts.add(new Account(accountNo, name));
		this.totalAccount += 1;
	}

	// ���� ��ȣ�� ���� ã�� -> ���� �ϳ�!!****
	// ��ü ���� ��Ͽ��� ���¹�ȣ ��ġ�ϴ� ��ü �ϳ��� ��ȯ toString override
	public void showAccount(String accountNo) {
		for (Account theAccount : accounts) {
			if (theAccount.getAccountNo() == accountNo) {
				System.out.println(theAccount.toString());
				return ;
			} else {
				System.out.println("�ش� ���°� �����ϴ�.");
			}
//			System.out.println(theAccount);
		}
	}

	// �����ȣ�� ���� ã��
	public Account getAccount(String accountNo) {
		Account theAccount = null;
		for (Account item : accounts) {
			if (item.getAccountNo() == accountNo) {
				theAccount = item;
				break;
			}
			theAccount = null;
		}
		return theAccount;
	}
	
	// �����ڸ����� ���� ã��
	public Account findAccounts(String name) {
		Account theAccount = null;
		for (Account item : accounts) {
			if (item.getName().equals(name)) {
//				System.out.println("���� ��ȣ ���ڸ� 2���ڸ� �Է����ּ��� >> ");
				theAccount = item;
			}
			theAccount = null;
		}
		return theAccount;
	}

	// ���� ����� ���� -> ���� ��� ��ü�� !!!
	public void getAccounts() {
		for (Account item : accounts) {
			System.out.println(item.toString());
		}
	}

	// �� ���¼��� ��ȯ
	public int getTotalAccount() {
		return totalAccount;
	}
}
