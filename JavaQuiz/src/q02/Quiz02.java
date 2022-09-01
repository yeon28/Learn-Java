package q02;

import java.util.Scanner;

/*
 * 비만도 계산하기.
 * 
 * console에서 사람의 체중, 키 입력받기(소수점 존재)
 * 비만도 수식에 넣기
 * 비만도 출력하기.
 * bmi < 18.5 인 경우 “저체중 입니다.”출력
 *  18.5 <= bmi < 25 인 경우 “정상 체중 입니다.”출력
 *   25 <= bmi < 30 인 경우 “과체중 입니다.”출력
 *    30 <= bmi인 경우 “비만 입니다.”출력
 */

public class Quiz02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("체중(kg)을 정확히 입력하세요.");
		float weight = input.nextFloat();

		System.out.println("키(m)을 정확히 입력하세요.");
		float height = input.nextFloat();

		float BMI;

		BMI = weight / height * height;

		System.out.println("BMI지수는 " + BMI + " 입니다.");

		if (BMI < 18.5) {
			System.out.println("저체중 입니다.");
		} else if ((18.5 <= BMI) && (BMI < 25)) {
			System.out.println("정상 체중 입니다.");
		} else if ((25 <= BMI) && (BMI < 30)) {
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("비만 입니다.");
		}
	}

}
