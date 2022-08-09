package p03.reference;

public class StringEqualsEx {

	public static void main(String[] args) {

		String name = null; // 64비트 주소를 0으로 세팅 --> 데이터가 없다는 뜻

		String strVar1 = "신민철"; // String literal
		String strVar2 = "신민철";

		int a = 10; // 정수 literal
		int b = 10;

		if (a == b) {
			System.out.println("a와 b의 값이 같음");
		} else {
			System.out.println("a와 b의 값이 틀림");
		}

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2의 참조가 같음(힙메모리 주소가 같음)");
		} else {
			System.out.println("strVar1과 strVar2의 참조가 틀림(힙메모리 주소가 틀림)");
		}

		System.out.println("strVar1 힙메모리 주소 : " + System.identityHashCode(strVar1));
		System.out.println("strVar2 힙메모리 주소 : " + System.identityHashCode(strVar2));

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2의 문자열이 같음");
		}

		strVar1 = "김민철"; // "김민철"로 테이터가 힙메모리로 새로 생성

		String strVar3 = "신민철";
		String strVar4 = "신민철";

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4의 참조가 같음(힙메모리 주소가 같음)");
		} else {
			System.out.println("strVar3과 strVar4의 참조가 틀림(힙메모리 주소가 틀림)");
		}

		System.out.println("strVar3 힙메모리 주소 : " + System.identityHashCode(strVar3));
		System.out.println("strVar4 힙메모리 주소 : " + System.identityHashCode(strVar4));

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4의 문자열이 같음");
		}

		if (name == null) {
			System.out.println("힙메모리에 저장된 데이터 없음");
		}
		strVar4 = null;

		if (strVar4 == null) {
			System.out.println("원래 힙메모리에 있는 '신민철'문자열은 힙메모리에 남아있지만, 연결은 사라짐. ");
		}

	}

}
