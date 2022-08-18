package q01.quiz05.Quiz3;

public class CheckingAccount extends Account {
	
	String cardNo;
	
	public CheckingAccount(String cardNo) {	
		this.cardNo= cardNo;
	}
	
	public CheckingAccount(String account,String owner,int balance,String cardNo) {
		super(account, owner, balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if ((!cardNo.equals(this.cardNo)) || (balance < amount)) 
				throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
}
