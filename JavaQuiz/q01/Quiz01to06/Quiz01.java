package Quiz01to06;

/*
 * 정수의 각 자리수 값 더하기
 * 
 * 0~1000사이의 3자리 정수 받기
 * 각 자리 수 뽑아내기
 * 각 자리 수 더하기
 * 출력
 *  
 */
import java.util.Scanner;

/*
 * 인풋받기
 * 3자리 정수 입력할 할 것 프린트 하기
 * 받은 인풋 값을 nextInt()
 * 첫번째 값
 * 두번째 값
 * 세번째 값
 * result에 총합 넣기 
 * 총합 출력
 */

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("3자리 정수를 입력하세요.");

		int fullNum = input.nextInt();

		System.out.println("입력된 값은 " + fullNum + "입니다.");

		int num3 = fullNum % 10; // 마지막 자리 수
		int num2 = (fullNum / 10) % 10; // 두번째 자리 수
		int num1 = (fullNum / 10) / 10; // 첫번째 자리 수

		System.out.println("첫번째 자리수 " + num1 + "입니다.");
		System.out.println("두번째 자리수 " + num2 + "입니다.");
		System.out.println("마지막 자리수 " + num3 + "입니다.");

		int result;

		result = num1 + num2 + num3;
		System.out.println("모두 더한 값은 " + result + "입니다.");

	}

}
