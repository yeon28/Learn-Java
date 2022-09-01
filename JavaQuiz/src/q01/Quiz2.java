package q01;

/*
 * 년과 일 수 구하기.
 * 
 * 분단위의 숫자를 읽고-> 몇 년인지 구하기. 며칠인지 구하기.
 * 받은 값으로 몇 년인지 구하기(years)
 * 받은 값으로 며칠인지 구하기(days)
 * 
 * 출력하기
 * 
 */
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int inputMinutes = input.nextInt();

		int days = inputMinutes / 1440;
		System.out.println(inputMinutes + " 분은 " + days + " 일 입니다.");

		int years = days / 365;
		System.out.println(inputMinutes + "분은 " + years + "년입니다.");

	}

}
