package p01.basic;

public class StringBasic6 {

	public static void main(String[] args) {

		String s1 = "wellcome to java";
		String s2 = "wellcome to java";
		String s3 = "wellcome to java";
		
		if (s1.equals(s2)) {
			System.out.println("s1과 s2의 문자열 내용이 같습니다.");
		}else {
			System.out.println("s1과 s2의 문자열 내용이 다릅니다.");
		}
		
		
		if (s1.equals(s3)) {
			System.out.println("s1과 s3의 문자열 내용이 같습니다.");
		}else {
			System.out.println("s1과 s3의 문자열 내용이 다릅니다.");
		}
		
		
		// ((s1.toUpperCase())  .equals  ((s3.toUpperCase())))
		if (s1.toUpperCase().equals(s3.toUpperCase())) {
			System.out.println("s1과 s3의 문자열 대문자로 내용이 같습니다.");
		}else {
			System.out.println("s1과 s3의 문자열 대문자로 내용이 다릅니다.");
		}
		
	}

}
