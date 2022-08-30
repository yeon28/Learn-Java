package Quiz3;

public class CreditLineAccount extends Account {
	
	public int creditLine; // 한도
	
	public CreditLineAccount() {	}
	
	public CreditLineAccount(String account, String owner, int balance,int creditLine) {
		super(account, owner, balance);
		this.creditLine = creditLine;
	}
	
	//인출 기능을 다시 구현하는 메소드
	public int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount) {
			throw new Exception("인출이 불가능합니다.");
		}else if (amount <= balance) {
			balance -= amount;
		}
		return balance;
	}
}
