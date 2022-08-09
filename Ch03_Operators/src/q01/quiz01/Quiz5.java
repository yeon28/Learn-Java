package q01.quiz01;

/*
 * 2개 정수로부터 연산하기
 * 
 * 2개의 정수값 받기
 * 덧셈 , 뻴셈 곱 평균 최대 최소 결과값 만들기
 * 출력
 * 
 */

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("2개의 정수 값을 입력하세요");

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int result = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = (num1 + num2) / 2;

		int max;
		max = (num1 > num2) ? num1 : num2;
		int min;
		min = (num1 < num2) ? num1 : num2;

		System.out.println("덧셈 : " + result);
		System.out.println("뺄셈 : " + result2);
		System.out.println("곱하기 : " + result3);
		System.out.println("평균 : " + result4);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
