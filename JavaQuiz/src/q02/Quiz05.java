package q02;

import java.util.Scanner;

/*
 * 숫자 추측하여 맞추기.
 * 
 * Math.random()을 사용하여 0~100까지 숫자 생성
 * 사용자에게 "0~100까지 숫자를 추측해 보세요?" 출력
 * 랜덤 숫자와 입력한 숫자가 같으면 "숫자가"  + number +"정확히 맞추었습니다." 출력,
 * break;
 * 랜덤 숫자가 입력한 숫자보다 크면, "당신의 추측한 숫자의 값이 낮습니다." 출력
 * 랜덤 숫자가 입력한 숫자보가 작으면, "당신의 추측한 숫자의 값이 높습니다." 출력
 */

public class Quiz05 {

	public static void main(String[] args) {

		int randomNum = (int) (Math.random() * 100 + 1);

		Scanner input = new Scanner(System.in);
		System.out.println("0~100까지 숫자를 추측해 보세요.");

		int answer = Integer.MAX_VALUE;

		do {
			answer = input.nextInt();

			if (randomNum < answer) {
				System.out.println("당신의 추측한 숫자의 값보다 낮습니다.");
			} else if (randomNum > answer) {
				System.out.println("당신의 추측한 숫자의 값보다 높습니다.");
			} else {
				System.out.println("숫자가 " + randomNum + " 정확히 맞추었습니다.");
			}

		} while (randomNum != answer);

	}

}
