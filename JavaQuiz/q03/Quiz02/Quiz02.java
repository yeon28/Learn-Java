package Quiz02;

import java.util.Scanner;

/* 02. 사원번호 형식 체크하기
 * 콘솔에서 입력된 사원번호 형식이 맞는지 체크하여 체크결과를 출력하기
 * 
 * 사원번호 형식 : ㅇㅇㅇ-ㅇㅇ-ㅇㅇㅇㅇ(1~9사이 숫자)
 * 사원번호 입력시 숫자와 '-'만 입력된다고 가정
 * Character.isDigit method 활용할 것 --> 숫자인지 확인하는 메소드(boolean type)
 * 
 * - 사원번호 입력형식과 입력 요청 출력
 * - 사원번호 값 받기.
 * - Character.isDigit 이용해 사원번호가 숫자로 이뤄졌는지 확인
 * - return값이 t-면 "(입력된 사원번호)는 사원번호 형식이 맞습니다."출력
 * - return 값이 f-면 ,,,
 * 
 */
public class Quiz02 {

	public static void main(String[] args) {

		System.out.println("사원번호를 형식에 맞게 입력하세요.");
		System.out.println("사원번호 형식 예시 : 123-45-6789");
		
		Scanner input = new Scanner(System.in);
		String num = input.next();
		
		num = num.replace("-","");
//		System.out.println(num);//확인
		
		
		char[] a = num.toCharArray();
//		System.out.println(a);// 확인
		
		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i])) {
				i++;
			}else {
//				System.out.println(num+" : 사원번호 형식이 아닙니다.");
			}
		}
		System.out.println(num+" : 사원번호 형식이 맞습니다.");
		

		

		
		
		
	}

}
