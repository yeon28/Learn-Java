package q04;

/*
 04. Account class 만들기
 
 은행계좌 Account class 만들고 테스트 하시오
 
▪ fields
• id (private int type, 초기값 0)
• balance (private double type, 초기값 0)
• annualInterestRate (private double type, 초기값 0)

▪ constructor
• default constructor 생성
• id와 balance를 초기화하는 constructor

▪ methods
• Getter/setter 만들기 : id, balance, annualInterestRate (년이자율은 4.5%로 입력될 경우 100으로 나눈 값이 annualInterestRate 변수에 들어감)
• getMonthlyInterest(), getMonthlyInterestRate()
• withdraw(double money), deposit(double money)

▪ TestAccount class
• id 1122, balance 20,000원 account 인스턴스 생성하고, 연이자율 4.5%으로 설정
• 2,500원 withdraw, deposit 3,000원 실행
• 출력내용 : balance, monthly interest rate
 */


public class Quiz04_TestAccount {

	public static void main(String[] args) {
		
		Quiz04_Account account = new Quiz04_Account(1122, 20000, 4.5);
		
		account.withdraw(2500);
		account.doubledeposit(3000);
		
		System.out.println( "잔고\t: "+ account.getBalance()+" 원");
		System.out.println("월이율\t: " + account.getMonthlyInterestRate()+" %");
	}

}
