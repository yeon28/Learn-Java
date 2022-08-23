package p06.user_default_exception;

/*
 * Account : 은행 계좌 잔고 관리 클래스
 */
public class Account {

	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족 : " + (money-balance) + " 모자람");
		}
		balance -= money;
	}
	
}
