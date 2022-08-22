package p01.basic;

import java.util.Scanner;

/*
 분모를 0으로 나누면 나오는 예외 출력하기.
 
 1. 2개의 정수 값을 입력 받아, 2개의 정수에 대하여 나누기 연산 수행
 2. 분모로 입력된 정수 값이 0이면 예외에러 발생하고 프로그램 강제 종료되는 현상 발생
 */
public class QuotientWithIf {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("2개의 정수값 입력");
		int num1 = in.nextInt();
		int num2 = in.nextInt();

		
		if (num2 != 0) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}else {
			System.out.println("분모에 0을 사용할 수 없습니다.");
			System.out.println("2번째 입력한 정수값으로 0이 아닌 정수를 입력하세요");
		}
		

		System.out.println(">> 프로그램 종료");
	}
}
