package q01.quiz05.Quiz3;

public class Account {

	String accountNo; // 계좌번호
	String ownerName; // 예금주명
	public int balance; // 잔고

	public Account() {
		balance = 0;
	}

	public Account(String account, String owner, int balance) {
		this.accountNo = account;
		this.ownerName = owner;
		this.balance = balance;
	}
	
//	-----------------------------------getter setter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
//	-----------------------------------
	
	// 예금
	public void deposit(int amount) {
		balance += amount;
	}

	// 인출
	public int withdraw(int amount) throws Exception {
		if (balance < amount) { // 잔액이 요구 금액보다 적으면 Exceptionq발생
			throw new Exception("잔액이 부족합니다.");
		} else if (amount <= balance) {
			balance -= amount;
		}
		return balance;
	}

}
