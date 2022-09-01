package q01;

/*
 * 4개의 정수값 일거 비교하기
 * 
 * 4개의 정수값 받기
 * 4개의 정수값이 동일한지 t/f로 확인
 * t -> 모두 같음 출력
 * f -> 동일하지 않음 출력
 * 
 */
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("4개의 정수 값을 입력하세요.");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();

		boolean sameNums;

		sameNums = ((num1 == num2) && (num3 == num4));

		if (sameNums) {
			System.out.println("4개 정수값이 동일합니다.");
		} else {
			System.out.println("4개 정수값이 동일하지 않습니다.");
		}

	}

}
