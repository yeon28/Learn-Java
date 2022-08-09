package p01.basic;

import java.util.Scanner;

public class StringBasic5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

//		System.out.println("spase로 구분된 3개의 단어를 입력하세요.");
//
//		String s1 = in.next();
//		String s2 = in.next();
//		String s3 = in.next(); // 문자열 string을 읽을 때
//
//		System.out.println("s1 = " + s1);
//		System.out.println("s2 = " + s2);
//		System.out.println("s3 = " + s3);
//
//		s3 = in.next(); // dummy

		System.out.println("다음에 한 줄 입력하고 enter key를 입력하세요");
		String s4 = in.nextLine();
		// 하나의 Line 전체 문자를 읽어 올 때 사용(s4에서는 enter key문자는 제외됨.)
		System.out.println("s4 = " + s4);

		System.out.println("s4 대문자 " + s4.toUpperCase());
		System.out.println("s4 소문자 " + s4.toLowerCase());
	}

}
