package p06.string_method;

import java.io.IOException;

/*
System.in.read(bytes)

- 키보드에서 byte[] 배열로 문자들을 읽어 byte배열에 집어 넣음
  - 키보드의 각 문자는 바이트 단위로 저장됨.
  - 한글(UTF-8)인 경우, 1개의 문자는 3개 바이트로 변환해 저장됨.
- read 메소드의 리턴 값은 읽어진 총 바이트 갯수 
  - 읽어진 바이트에는 엔터키(\r,\n)도 포함됨.

- new String(bytes, 0, readByteNo-2)에서  readByteNo-2는 엔터키(\r,\n) 제외한 값
 */
public class KeyboradToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		System.out.println("readByteNo : " + readByteNo);
		
		String str = new String(bytes, 0, readByteNo-2);
		// readByteNo-2 --> 엔터키(\r,\n)제외한 값
		System.out.println(str);
	}
	
}
