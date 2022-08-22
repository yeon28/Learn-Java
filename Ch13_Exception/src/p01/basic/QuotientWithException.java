package p01.basic;

import java.util.Scanner;

/*
분모를 0으로 나누면 나오는 예외 출력하기.

1. 2개의 정수 값을 입력 받아, 2개의 정수에 대하여 나누기 연산 수행
2. 분모로 입력된 정수 값이 0이면 예외에러 발생하고 프로그램 강제 종료되는 현상 발생
*/
/*
Java - Exception class 사용하여 에러 처리하기.

1. try{} catch{} 문법 사용
2. try 안에는 나눗셈 메소드 실행하면서 exception인스턴스 발생하면 catch 안에 있는 코드 실행
3. try 안에 exception 발생하여 catch가 실행되더라도 나머지 코드들이 정상 실행됨.
 */
public class QuotientWithException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("2개의 정수값 입력");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		
		try {
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + quotient(num1, num2));
		} catch (ArithmeticException e) { // catch 받음
			System.out.println(e.getMessage());
		}
		

		System.out.println(">> 프로그램 종료");
	}

	public static int quotient(int num1, int num2) {
		if (num2 == 0) {
			// 강제로 exception 발생 
			// (ArithmeticException class에 인스턴스를 생성하여 exception 발생)
			throw new ArithmeticException("분모에 해당하는 값으로 0을 사용할 수 없습니다.");
			// throw 던짐
			//문자열을 받는 ArithmeticException 생성자
		}
		return (num1 / num2);
	}
}
