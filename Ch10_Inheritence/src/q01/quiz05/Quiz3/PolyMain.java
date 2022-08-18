package q01.quiz05.Quiz3;

public class PolyMain {

	public static void main(String[] args) {

		Account obj1= new Account("111-22-333", "임꺽정", 10000);
		
		CheckingAccount obj2  = new CheckingAccount("444-55-6666", "홍길동", 20000, "555-666-777-888");
		
		CreditLineAccount obj3 = new CreditLineAccount("777-88-9999", "김선달", 30000, 2000000);
		
		BonusPointAccount obj4 = new BonusPointAccount("000-00-0000", "김미영", 0, 0);
		
		printAccountInfomation(obj1);
		printAccountInfomation(obj2);
		printAccountInfomation(obj3);
		printAccountInfomation(obj4);
	}
	
	// 다양한 타입의 객체를 가지고 있는 메소드 호출
	
	
	// 다양한 타입의 객체를 한 타입 (Account obj)의 파라메터 변수로 받음
	static void printAccountInfomation(Account obj) {
		System.out.println("계좌번호\t : "+ obj.getAccountNo());
		System.out.println("예금주\t : "+ obj.getOwnerName());
		System.out.println("잔액\t : "+ obj.getBalance());
		System.out.println();
	}

}
