package q01.quiz02;

import java.util.Scanner;

/*
 * 입력한 숫자 분석
 * 
 * while문을 이용하여 정수를 입력
 * 입력한 양수의 전제 개수, 음수의 전체개수, 전체 평균값을 출력
 * 입력값이 0이 되면 빠져나옴.
 */

public class Quiz06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int inputNums;

		int sumAll = 0;
		int sumChance = 0;

		int negativeNumChance = 0;
		int positiveNumChance = 0;

		System.out.println("정수를 입력하세요. 단, 입력한 숫자가 0이면 입력이 종료됩니다. ");

		while (true) {

			inputNums = in.nextInt();

			if (inputNums == 0) {
				break;
			} else {
				sumAll += inputNums;
				sumChance++;

				if (inputNums < 0) {
					negativeNumChance++;
				} else {
					positiveNumChance++;

				}
			}

		}
		System.out.println("양수는 " + positiveNumChance + "개 입니다");
		System.out.println("음수는 " + negativeNumChance + "개 입니다");
		System.out.println("평균값은 " + sumAll / sumChance + " 입니다");

	}
}
