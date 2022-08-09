package p04.dowhile_prac;

import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);

		int answer = Integer.MAX_VALUE;// 정수 최대값 초기화

		
		do {
			System.out.println(num1 + "과 " + num2 + "합계는?");
			answer = input.nextInt();

			if ((num1 + num2) != answer) {
				System.out.println("정답이 아닙니다. 다시 시도하세요.");
			}
		} while ((num1 + num2) != answer);

		System.out.println("정답입니다.");
	}

}
