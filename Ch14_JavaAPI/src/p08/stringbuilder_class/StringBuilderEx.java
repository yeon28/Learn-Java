package p08.stringbuilder_class;

/*
String 문제점 : 새로운 문자열이 생길 때마다, 기존 문자열과 함께 힙메모리에 새로 만들어짐.(사라지지 않음, 프로그램 무거워짐.)

StringBuilder class는 String 클래스의 문제점 해결함.
- 문자열 연산을 하더라도 힙메모리에 한 개의 문자열로 관리가 됨.
- 내부적으로 StringBuilder 클래스가 byte[] 배열을 넉넉한 크기로 초기에 만듦.
 */
public class StringBuilderEx {

	public static void main(String[] args) {
		// new byte[1000]; --> 내부적으로 StringBuilder 클래스가 byte[] 배열을 넉넉한 크기로 초기에 만듦.
		StringBuilder sb = new StringBuilder(); // sb = ""; --> sb는 빈 문자열

		sb.append("Java_"); 
		sb.append("Programming study"); //.append()는 문자열 끝부터 입력받은 문자열 넣기.
		System.out.println(sb);

		sb.insert(4, "2"); // 문자열길이 4번째 "2" 넣기
		System.out.println(sb);

		sb.setCharAt(4, '6'); // 문자열길이 4번째 '6' char type 넣기
		System.out.println(sb);

		sb.replace(6, 13, "Book"); // 문자열길이 6번째에서 13번째를 "Book"으로 바꾸기.
		System.out.println(sb);

		sb.delete(4, 5);	// 문자열길이 4번째에서 5번째를 지우기.
		System.out.println(sb);

		System.out.println("총문장수 : " + sb.length());
		
		System.out.println(sb.toString());

	}
}
