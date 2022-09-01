package q05;

public class Quiz03_CheckingAccount extends Quiz03_Account {
	
	String cardNo;
	
	public Quiz03_CheckingAccount(String cardNo) {	
		this.cardNo= cardNo;
	}
	
	public Quiz03_CheckingAccount(String account,String owner,int balance,String cardNo) {
		super(account, owner, balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if ((!cardNo.equals(this.cardNo)) || (balance < amount)) 
				throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
}
