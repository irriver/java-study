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

	// 계좌 생성 메소드***
	public void addAccount(String accountNo, String name) {
		this.accounts.add(new Account(accountNo, name));
		this.totalAccount += 1;
	}

	// 계좌 번호로 계좌 찾기 -> 계좌 하나!!****
	// 전체 계좌 목록에서 계좌번호 일치하는 객체 하나를 반환 toString override
	public void showAccount(String accountNo) {
		for (Account theAccount : accounts) {
			if (theAccount.getAccountNo() == accountNo) {
				System.out.println(theAccount.toString());
				return ;
			} else {
				System.out.println("해당 계좌가 없습니다.");
			}
//			System.out.println(theAccount);
		}
	}

	// 계봐번호로 계좌 찾기
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
	
	// 소유자명으로 계좌 찾기
	public Account findAccounts(String name) {
		Account theAccount = null;
		for (Account item : accounts) {
			if (item.getName().equals(name)) {
//				System.out.println("계좌 번호 끝자리 2글자를 입력해주세요 >> ");
				theAccount = item;
			}
			theAccount = null;
		}
		return theAccount;
	}

	// 계좌 목록을 본다 -> 계좌 목록 전체를 !!!
	public void getAccounts() {
		for (Account item : accounts) {
			System.out.println(item.toString());
		}
	}

	// 총 계좌수를 반환
	public int getTotalAccount() {
		return totalAccount;
	}
}
