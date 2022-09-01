package q05;

public class Quiz03_CreditLineAccount extends Quiz03_Account {
	
	public int creditLine; // 한도
	
	public Quiz03_CreditLineAccount() {	}
	
	public Quiz03_CreditLineAccount(String account, String owner, int balance,int creditLine) {
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
