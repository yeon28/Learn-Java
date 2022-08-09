package p01.basic;

import java.util.Scanner;
// 배열을 사용해 코딩 단순화 
public class ArrayBasic8 {

	public static void main(String[] args) {

		String[] months = {"Jan", "Feb", "Mar", "Apr","May","Jun","Jul","Sep","Aug","Oct", "Nov","Dec"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("달력 숫자를 입력하세요.");
		int month = input.nextInt();

		
		System.out.println("이번달은 " + months[month-1] + "입니다." );
		
//		switch (month) {
//		case 1:
//			System.out.println("이번달은 Jan입니다.");
//			break;
//		case 2:
//			System.out.println("이번달은 Feb입니다.");
//			break;
//
//
//		}
	}

}
