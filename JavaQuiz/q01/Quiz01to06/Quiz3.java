package Quiz01to06;

import java.util.Scanner;

/*
 * 6개월 후 적금 총액 구하기
 * 
 * 매월 적금금액과 1년 이자율 값을 받음
 * 6개월 후 이자금액 값 출력
 * 6개월 후 원금 값 출력
 * 이자금액과 원금 합한 값을 출력 
 * 
 */

public class Quiz3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("매달 적금액을 입력하세요.");

		int inputInstallment = input.nextInt();

		System.out.println("연이율을 입력하세요.");

		float inputYearRate = input.nextInt();

		System.out.println("매달 적금액은 " + inputInstallment + "입니다.");

		double monthRate = inputYearRate / 12 * 0.01;
		System.out.println("월이자율은 " + monthRate + "입니다.");

		double month1 = inputInstallment * (monthRate + 1);
		double month2 = (inputInstallment + month1) * (monthRate + 1);
		double month3 = (inputInstallment + month2) * (monthRate + 1);
		double month4 = (inputInstallment + month3) * (monthRate + 1);
		double month5 = (inputInstallment + month4) * (monthRate + 1);
		double month6 = (inputInstallment + month5) * (monthRate + 1);
		System.out.println("6개월 적금 총액은" + month6 + "입니다.");

	}

}
