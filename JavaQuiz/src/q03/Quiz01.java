package q03;

import java.util.Scanner;

/*01. 학생정보 출력하기
 * 콘솔에 2문자로 구성된 문자열을 입력받아 학생이 소속된 과이름과 학년을 출력하시오
 * 
 * 입력문자열 영어 한 글자 + 숫자 한 글자 입력
 * 영어 --> I:정보학과, A:회계학과, C:컴퓨터학과
 * 숫자 --> 1,2,3,4학년
 * 
 * - 스케너 문자열 입력 받기
 * - 학과 구분
 * - 학년 구분
 * - 콘솔에 00학과 0학년 입니다 출력함.
 */
public class Quiz01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("문자입력");

		String stu = in.next();

		String result1 = stu.substring(0, 1); // 학과

		String result2 = stu.substring(1, 2); // 학년


		switch (result1) {
		case "I":
			System.out.print("정보학과 ");
			break;
		case "A":
			System.out.print("회계학과 ");
			break;
		case "C":
			System.out.print("컴퓨터학과 ");
			break;
		default:System.out.println("등록된 학과 정보가 없습니다.");
			break;
		}
		
		switch (result2) {
		case "1": System.out.print("1학년 입니다.");
			break;
		case "2":System.out.print("2학년 입니다.");
			break;
		case "3":System.out.print("3학년 입니다.");
			break;
		case "4":System.out.print("4학년 입니다.");
			break;
		default:System.out.println("1~4학년까지 있습니다.");
			break;
		}
	}

}
