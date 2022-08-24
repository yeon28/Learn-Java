package p06.string_method;

// trim()은 문자열 앞 뒤의 공백을 제거하는 메소드
public class StringTrimEx {

	public static void main(String[] args) {
		String tel1 = "   02    ";
		String tel2 = "123      ";
		String tel3 = "   2134  ";

		String tel = tel1 + tel2 + tel3;
		System.out.println(tel);

		System.out.println();
		
		tel = tel1.trim() + tel2.trim() + tel2.trim();
		System.out.println(tel);
	}

}
