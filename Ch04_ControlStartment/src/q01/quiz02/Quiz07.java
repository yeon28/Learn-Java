package q01.quiz02;

import java.util.Scanner;

/*
 * 6개월 후의 적금 총액 구하기
 * 
 * 매월 적금 금액과 1년 이자율을 키보드로 읽어 6개월 후 의 이자와 원금을 합한 총액 출력.
 * for문 사용
 * 
 */

public class Quiz07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("매달 적금액을 입력하세요.");
		int inputInstallment = input.nextInt();
	
		System.out.println("연이율을 입력하세요.");
		float inputYearRate = input.nextInt();
		
		double monthRate = inputYearRate / 12 * 0.01;

		double sixMonth = 0;
		
		for (int i = 0; i <=6 ; i++) {
			sixMonth *= (monthRate + 1);
		}
		sixMonth *= inputInstallment; 
		
		System.out.println("6개월 적금 총액은" + sixMonth + "입니다.");
		
		
	}

}
