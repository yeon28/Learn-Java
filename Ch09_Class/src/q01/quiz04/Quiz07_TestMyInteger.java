package q01.quiz04;

/*
 7. MyInteger class 만들기
 
 MyInteger class 만들고 테스트 하시오

▪ fields
• value (private int type)

▪ constructor
• MyInteger(int value)

▪ methods
• public int getValue() : value 가져오기
• public boolean isEven() : value가 짝수인지 체크
• public boolean isOdd() : value가 홀수인지 체크
• public boolean equals(int number) : value와 number가 같은지 체크

▪ TestMyInteger class
• value가 7, 26인 MyInteger 인스턴스 생성
• 2개 인스턴스에 대하여 getValue(), isEven(), isOdd(), equals method 실행
• equals method 실행할 때 입력되는 number는 7을 입력할 것
 */

public class Quiz07_TestMyInteger {
	public static void main(String[] args) {

		Quiz07_MyInteger myint1 = new Quiz07_MyInteger(100);

		myint1.printInterestValue();
		myint1.printEqualWithValue();
		System.out.println(myint1.equals(7));

		System.out.println("----------------------------------");

		Quiz07_MyInteger myint2 = new Quiz07_MyInteger(26);

		myint2.printInterestValue();
		myint2.printEqualWithValue();
		System.out.println(myint1.equals(7));

	}
}
