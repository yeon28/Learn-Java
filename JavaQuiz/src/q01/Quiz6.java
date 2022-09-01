package q01;

/*
 * 2개의 실수값 범위 체크
 * 
 * 2개의 실수(double)을 받기
 * 두 실수가 0과 1사이에 있는지 t/f로 확인하기
 * if문으로 두 실수가 모두 0과 1사이의 소수이면 "두 수 모두 0과 1사이에 있습니다"출력
 * 아니면 "두수 모두 0과 1사이에 있지 않습니다" 출력
 * 
 */
import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("2개의 실수를 입력하세요.");

		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		boolean num1Check = (0 < num1) && (num1 < 1);
		boolean num2Check = (0 < num2) && (num2 < 1);

		if (num1Check == num2Check) {
			System.out.println("두 수 모두 0과 1사이에 있습니다");
		} else {
			System.out.println("두 수 모두 0과 1사이에 있지 않습니다");
		}

	}

}
