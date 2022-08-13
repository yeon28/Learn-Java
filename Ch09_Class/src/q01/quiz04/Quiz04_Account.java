package q01.quiz04;

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

public class Quiz04_Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;

	public Quiz04_Account() {
		// default constructor 생성
	}

	public Quiz04_Account(int newAccount, double newBalance, double newAnnualInterestRate) {
		this.id = newAccount;
		this.balance = newBalance;
		this.annualInterestRate = newAnnualInterestRate;

	}

//	-------------------------getter method 

	public int getID() { // 사용자id
		return id;
	}

	public double getBalance() { // 잔고
		return balance;
	}

	public double getAnnualInterestRate() { // 연이율
		return annualInterestRate * 100;
	}

	public double getMonthlyInterestRate() { // 월이자율
		return getAnnualInterestRate()/100 / 12;

	}

	public double getMonthlyInterest() { // 월이자

		return balance * getMonthlyInterestRate();
	}
	
//	-------------------------setter method 

	public void withdraw(double money) { // 인출
		balance -= money;

	}

	public void doubledeposit(double money) { // 예금
		balance += money;

	}

}
