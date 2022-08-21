package q01.quiz01;

import java.util.Iterator;
import java.util.Scanner;

/* 06.password체크하기
 * 
 * 웹사이트에서 password를 체크하는 메소드를 만들고, 
 * 콘솔에서 password문자열을 입력하여 password가 유효한지 결과를 출력
 * 
 * password조건
 * : 최소 10자리 이상, 영문자와 숫자만 가능, 최소 숫자 3개 필요.
 * 
 * 출력결과
 * : 유효하면, pw문자열 + "은 유효합니다."
 * : 유효하지 않으면, pw문자열 + "은 유효하지 않습니다."
 * 
 * 힌트)
 * Character.isLetterOrDigit
 * Character.isDigit
 * 
 */
public class Quiz06 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("PassWord를 입력하세요.");

		String passWord = input.nextLine();
		
		char[] chrPW = passWord.toCharArray();

		if ((10 <= chrPW.length)) {
			for (int i = 0; i < chrPW.length; i++) {
				if (Character.isLetterOrDigit(chrPW[i]) && Character.isDigit(chrPW[i])) {
					System.out.println(passWord + "은 유효합니다.");
				} else {
					System.out.println(passWord + "은 유효하지 않습니다.");
				}

			}
		} else {
			System.out.println(passWord + "은 유효하지 않습니다.");
		}

	}
}
