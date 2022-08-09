package p01.If_basic;

import java.util.Scanner;

/*
 * if (boolean) {A} else {B}
 * 불린 값이 참이면 A실행; 거짓이면 B실행
 */

public class IfBasic {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		
		double area = 0.0;
		
		area = radius * radius * 3.14;
		System.out.println("원의 면적은 " + area + "입니다.");
		// 음수 값을 넣어도 결과 값이 나옴 
		
//------------------------------------------------------------------
		
		
		// 음수 값을 넣으면 안되도록 if문 사용
		if (radius >= 0) {
			area = radius * radius * 3.14; 
			System.out.println("원의 면적은 " + area + "입니다.");
		} else {
			System.out.println("반지름은 양수를 입력하셔야 합니다.");
		}
		
	}

}
