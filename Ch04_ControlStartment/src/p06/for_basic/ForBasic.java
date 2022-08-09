package p06.for_basic;

import java.util.Scanner;

public class ForBasic {

	public static void main(String[] args) {

		// for (초기값; 조건식; 증감연산) {A}
//		for (int i = 0; i <= 10; i ++) {
//		System.out.println("java!");
//		}

		int sum = 0;
		Scanner input = new Scanner(System.in);

//		System.out.println("1부터 시작하여 합계를 구할 최종 숫자를 입력하세요.");
		System.out.println("합계를 구할 시작 숫자와 최종 숫자를 입력하세요.");
		int startNum = input.nextInt();
		int lastNum = input.nextInt();

		for (int num = startNum; num <= lastNum; num++) {
			sum += num;
		}

		System.out.println(startNum + " ~ " + lastNum + "합은 " + sum);
	}

}
