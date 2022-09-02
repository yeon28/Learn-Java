package javatest;

import java.util.Scanner;

public class CountStr {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean b = true;

		while (b) {
			System.out.print("문자열 입력 : ");
			String str = input.nextLine();
			if (str.equals("exit")) {
				b = false;
				break;
			} else {
				System.out.println(str.length() + "글자입니다.");
			}

		}
		System.out.println("프로그램을 종료합니다.");

	}
}
