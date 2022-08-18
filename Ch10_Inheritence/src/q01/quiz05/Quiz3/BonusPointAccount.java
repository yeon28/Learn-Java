package q01.quiz05.Quiz3;

public class BonusPointAccount extends Account {
	int bonusPoint;
	
	//
	public BonusPointAccount() {	}
	public BonusPointAccount(String account, String owner, int balance,int bonusPoint ) {
		super(account, owner, balance);
		this.bonusPoint = bonusPoint;
	}
	
	// 예금 기능을 다시 구현하는 메소드
	public void deposit(int amount) {
		balance += amount;
		super.deposit(amount); // deposit()을 호출하여 계산
		bonusPoint += (int)(amount*0.001);
	}
}
