package p06.user_default_exception;

/*
 * Account : ���� ���� �ܰ� ���� Ŭ����
 */
public class Account {

	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	// �Ա�
	public void deposit(int money) {
		balance += money;
	}
	
	// ���
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("�ܰ���� : " + (money-balance) + " ���ڶ�");
		}
		balance -= money;
	}
	
}
