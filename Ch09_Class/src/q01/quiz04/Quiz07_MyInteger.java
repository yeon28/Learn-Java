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
• ublic boolean equals(int number) : value와 number가 같은지 체크

▪ TestMyInteger class
• value가 7, 26인 MyInteger 인스턴스 생성
• 2개 인스턴스에 대하여 getValue(), isEven(), isOdd(), equals method 실행
• equals method 실행할 때 입력되는 number는 7을 입력할 것
*/

public class Quiz07_MyInteger {
	private int value;

	public Quiz07_MyInteger() {
		value = 0;
	}

	public Quiz07_MyInteger(int val) {
		this.value = val;
	}

//	--------------------------------------

	public int getValue() {
		return value;
	}

	public boolean isEven() { // 짝수 확인
		if (value % 2 == 0) {
			return true;
		} else
			return false;

	}

	public boolean isOdd() { // 홀수 확인
		if ((value % 2 != 0) || (value == 1)) {
			return true;
		}
		return false;

	}

	public boolean equals(int number) { // value와 number가 같은지 체크
		if (number == value) {
			return true;
		}else {
			return false;
		}
		
	}

	public void printInterestValue() {
		System.out.println("value 값은 " + getValue() + "입니다.");
		System.out.print(getValue() + "은(는) 짝수 입니까?");
		System.out.println(" --> " + isEven());
		System.out.print(getValue() + "은(는) 홀수 입니까?");
		System.out.println(" --> " + isOdd());
	}

	public void printEqualWithValue() {
		System.out.println("\r equals의 값과 같습니까?");
		System.out.print(" --> ");
	}

}
