package p01.basic;

import java.util.Scanner;

/*
분모를 0으로 나누면 나오는 예외 출력하기.

1. 2개의 정수 값을 입력 받아, 2개의 정수에 대하여 나누기 연산 수행
2. 분모로 입력된 정수 값이 0이면 예외에러 발생하고 프로그램 강제 종료되는 현상 발생
*/
public class QuotientWithMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("2개의 정수값 입력");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(num1 + " / " + num2 + " = " + quotient(num1, num2));

		System.out.println(">> 프로그램 종료");
	}

	public static int quotient(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("분모에 해당하는 값으로 0을 사용할 수 없습니다.");
			System.exit(1);
		}
		return (num1 / num2);
	}
}
