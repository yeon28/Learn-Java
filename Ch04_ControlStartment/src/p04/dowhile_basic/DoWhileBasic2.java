package p04.dowhile_basic;

import java.util.Scanner;

public class DoWhileBasic2 {

	public static void main(String[] args) {

		int sum = 0;
		int input_num;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("덧셈할 숫자를 입력하세요. 단, 입력한 숫자가 0이면 덧셈이 종료됩니다.");
			input_num = input.nextInt();
			sum += input_num;
		} while (input_num != 0);

		System.out.println("sum = " + sum);

		// ------------------------------------------------------------

		// while문으로 같은 프로그램 작성하기.
		System.out.println("덧셈할 숫자를 입력하세요. 단, 입력한 숫자가 0이면 덧셈이 종료됩니다.");

		input_num = input.nextInt();

		while (input_num != 0) {
			sum += input_num;
			System.out.println("덧셈할 숫자를 입력하세요. 단, 입력한 숫자가 0이면 덧셈이 종료됩니다.");
			input_num = input.nextInt();
		}
		System.out.println("sum = " + sum);
	}

}
