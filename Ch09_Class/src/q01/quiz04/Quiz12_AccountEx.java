package q01.quiz04;

/*
 19. 상수 선언 사용, getter setter method 생성하기 
  
 	<잔고 범위>
  MIN_BALANCE : 0원 
  MAX_BALANCE : 100만원 
  
 */

public class Quiz12_AccountEx {

	public static void main(String[] args) {
		
		Quiz12_Account account = new Quiz12_Account();
		
		account.setBalance(10000);	// 1만원 
		System.out.println("현재 잔고 : "+account.getBalance()+"원");
		
		
		account.setBalance(-100);	//마이너스 잔고 
		System.out.println("현재 잔고 : "+account.getBalance()+"원");
		
		
		account.setBalance(2000000); //200만원 
		System.out.println("현재 잔고 : "+account.getBalance()+"원");
		
		
		account.setBalance(300000);	//30만원 
		System.out.println("현재 잔고 : "+account.getBalance()+"원");
		
		
	}

}
