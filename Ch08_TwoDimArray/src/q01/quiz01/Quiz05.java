package q01.quiz01;

import java.util.Scanner;

/*문자열의 영문자 숫자 알아 맞추기.
 * 
 * 문자열에서 영문자의 숫자를 세는 메소드를 만들고 사용결과를 출력하시오
 * 메소드 이름 : public static int countLetters(String s)
 * 영문자는 a~z A~Z만 해당, 외 다른 문자 제외
 * Character.isLetter메소드 사용
 
 */
public class Quiz05 {

	public static int countLetters(String s) {
		int sum = 0;

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("문자를 입력하세요.");

		String letter = in.nextLine();

		System.out.println("전제 문자 개수는 " + countLetters(letter) + "개 입니다.");

	}

}
