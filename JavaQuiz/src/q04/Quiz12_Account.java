package q04;

/*
 19. 상수 선언 사용, getter setter method 생성하기 
  
 	<잔고 범위>
  MIN_BALANCE : 0원 
  MAX_BALANCE : 100만원 
  
 */

public class Quiz12_Account {
	double balance; // 잔고
	
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000; // 백만

	public Quiz12_Account() {
		balance = 10000;
	}
	
//	---------------------------getter method
	
	public double getBalance() {
		return balance;
	}
	
//	---------------------------setter method
	public boolean setBalance(double bal) { // 잔고 지정
		// 0 <= 잔고 <= 100만원 
		if ((MIN_BALANCE <= bal) && (bal <= MAX_BALANCE)) {
			balance = bal;
			return true;
		}else {
			return false; 
		}

	}
}
