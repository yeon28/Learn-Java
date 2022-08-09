package p01.basic;

public class StringBasic4 {

	public static void main(String[] args) {

		String s1 = "wellcome to java";
		String s2 = "java";
		String s3;

		s3 = s1.concat(s2);
		System.out.println("s3 = " + s3);
		System.out.println("s1.length = " + s1.length());
		System.out.println("s2.length = " + s2.length());
		System.out.println("s3.length = " + s3.length());

		s3 = s2.concat(s1); // --> s1 = s2
		System.out.println("s3 = " + s3);

		s3 = s1 + s2;
		System.out.println("s3 = " + s3);
		
		s3 = s2 + s1;
		System.out.println("s3 = " + s3);
	}

}
