package p01.if_practice;

import java.util.Scanner;

/*
 * 뺄셈 퀴즈 : 2개의 정수로 부터 뺄셈 연산 수행 
 * 1. 항상 결과 값은 양의 정수로 출력 (n1 n2 가 있을 때 항상 n1이 n2보다 커야함.)
 * 2. 2개의 정수 값은 0~9 사이의 숫자
 */
public class SubteactQuiz {

	public static void main(String[] args) {
		/*
		 * - Math.random()은 리턴 값을 0~0.99999999999999사이의 실수값 넘김 
		 * - Math.random()*10은 0~0.999999
		 * 0~0.999999 (int)(Math.random()*10) 은 0 1 2 ...9 사이의 정수값
		 */

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		if (num1 < num2) {
			// 3개의 숫자를 맞바꾸는 로직 {swapping}
			int temp;

			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.println("num1이 " + num1 + "이고, " + 
						" num2가 " + num2 + "인 경우 num1 - num2의 값은?");

		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		if ((num1 - num2) == answer) {
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
			System.out.println(num1 + "-" + num2 + "는 " + (num1 + num2) + "임.");
		}

	}

}
