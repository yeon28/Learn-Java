package p09.regular_excression;

import java.util.regex.Pattern;

/*
 정규표현식(regular expression)
 
 - mini programming language 같은 것..?
   - 문법을 이해하고 외워야 사용할 수 있다는 단점 있음.
 - 대상은 문자열(String)
 - 사용 목적은 특정문자열 검색, 추출, 삭제 등 문자열 연산 관련, 다양한 방식으로 사용

 - 위 예제는 해당하는 pattern이 맞는지 검색하는 프로그램
 
   - 100page 문서(문자열)에서 전화번호에 해당하는 모든 것을 추출
     정규표현식 "(02|010) - \\d{3,4}-\\d{4}"설명
     (02|010) 	-> 02 or 010
      - 		-> '-'문자열 나옴
      \d 		-> d는 digit(숫자 0~9)을 의미함(MS windows에서는 \를 \\로 표현함.)
      {3,4}		-> 연속하는 3자리 문자열이나 4자리 문자열 들어옴, \d{3,4}는 3자리나 4자리 숫자 있음
      {4}		-> 연속하는 4자리 문자열 들어옴,  \d{4}는 4자리 숫자 있음
      
   - 100page 문서(문자열)에서 이메일에 해당하는 모든 것을 추출
     정규표현식 "\\w+ @ \\w+ \\. \\w+ (\\. \\w+)?"; 설명
     \w			-> 영어 알파벳 대소문자 들어옴
     +			-> 1개 이상 있음
     @			-> '@' 나옴 
     \.			-> '.'이 그대로 있음
     ?			-> 0번 또는 1번있음,(\\.\\w+) 있을 수도 있고 없을 수도 있다는 의미
 */
public class PatternEx {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // 전화번호에 관한 regular expression
		String data = "010-123-5678";
		boolean result = Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식이 일치함");
		} else {
			System.out.println("정규식이 일치하지 않음");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // 이메일 주소에 관한 regular expression
		data = "angel@naver.co.kr";
		result =  Pattern.matches(regExp, data);
		
		if (result) {
			System.out.println("정규식이 일치함");
		} else {
			System.out.println("정규식이 일치하지 않음");
		}
	}
	
}
