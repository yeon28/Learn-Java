package q01.quiz01;

import java.util.Scanner;

/* 03. 문자열 간에 포함관계여부 확인하기
 * 
 * 콘솔에서 2개의 문자열을 읽어 2번째 문자열이 첫번째 문자열의 substring인지 출력하시오
 * 입력메시지 "첫번째 문자열을 입력하시오" "두번째 문자열을 입력하시오"
 * 출력 포멧.
 * 
 * 
 */
public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번째 문자열을 입력하세요.");
		String arr1 = in.next();
		
		System.out.println("두번째 문자열을 입력하세요.");
		String arr2 = in.next();
		
		if (arr1.contains(arr2)) {
			System.out.println(arr2 +"는 " + arr1+"의 포함관계 입니다."); 
		}else {
			System.out.println(arr2 +"는 " + arr1+"의 포함관계가 아닙니다.");
		}
		
		 
		
	}

}
