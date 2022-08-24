package p06.string_method;

import java.io.UnsupportedEncodingException;

/*
문자열 encoding 및 decoding

- 일반적으로 인코딩은 암호화 하는 것, 디코딩은 암호를 해독하는 것

- 인코딩이란, 특정 문자 set으로 코드 변환한 것
  ex) UTF-8, MS949, EUC-KR
    - '가'를 유니코드(2byte)에서 utf-8(3byte)로 변환
  - str.getBytes();	-> IDE에서 지정된 기본 encoding 방식(eclipse에서 utf-8로 설정을 바꿔주는 이유)
  - str.getBytes("EUC-KR"); -> EUC-KR 문자 set으로 encoding
  - str.getBytes("UTF-8"); -> UTF-8 문자 set으로 encoding
  
- 디코딩이란, 특정문자 set으로 변환된 바이트 배열을 원래 문자로 복구하는 것.
  - new String(b1); -> IDE에서 지정된 기본 decoding 방식
  - new String(b2, "EUC-KR"); -> UTF-8로 encoding된 것을 유니코드로 decoding 
  - new String(b3, "UTF-8"); -> EUC-KR로 encoding된 것을 유니코드로 decoding

+) 자바는 내부적으로 모든 문자를 유니코드(2byte)로 변환해 관리하고 있음.
   ex) '가'의 유니코드값은 '\uAC00'

- 한글 한 글자는 utf-8은 3byte, euc-kr은 2byte임.

- 결론, 현재 가장 보편적인 인코딩 방식은  UTF-8을 사용함(web programing에서도 de facto standard로 인정)

- 프로그램밍에서 인코딩/디코딩이 나온 이유
  - 통신망을 통해 데이터를 주고(encoding) 받을(decoding) 때 사용함.
  - 파일을 저장(encoding)하고 읽을(decoding) 때 사용함.
 */
public class StringGetBytesEx {

	public static void main(String[] args) {
		String str = "안녕하세요";

		byte[] b1 = str.getBytes();
		System.out.println("b1 length :" + b1.length);
		String s1 = new String(b1);
		System.out.println("s2 : " + s1);

		System.out.println("-----------------------------------");
		
		try {
			byte[] b2 = str.getBytes("EUC-KR"); // EUC-KR 인코딩(encoding)
			System.out.println("b2 length - EUC-KR로 인코딩 :" + b2.length);
			String s2 = new String(b2, "UTF-8"); // UTF-8 디코딩(decoding)
			System.out.println("s2 - UTF-8로 디코딩 : " + s2);

			byte[] b3 = str.getBytes("UTF-8"); // UTF-8 인코딩(encoding)
			System.out.println("b3 length - UTF-8로 인코딩  :" + b3.length);
			String s3 = new String(b3, "EUC-KR"); // EUC-KR 디코딩(decoding)
			System.out.println("s3 - EUC-KR로 디코딩 : " + s3);

		} catch (UnsupportedEncodingException e) {
			System.out.println("Java에서 지원하지 않는 encoding 방식 Exception 발생");
		}

	}

}
