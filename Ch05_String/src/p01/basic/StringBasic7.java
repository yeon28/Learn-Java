package p01.basic;

public class StringBasic7 {

	public static void main(String[] args) {

		String s1  = "apple";
		String s2  = "bananan";
		String s3  = "pineapple";
		String s4  = "bananan";
		
		System.out.println(s1+ "과" +s2+"의 크기 비교 : " + s1.compareTo(s2));
		System.out.println(s1+ "과" +s3+"의 크기 비교 : " + s1.compareTo(s3));
		System.out.println(s2+ "과" +s1+"의 크기 비교 : " + s2.compareTo(s1));
		System.out.println("키위와 오렌지의 크기 비교 : " +"kiwi".compareTo("orange"));
		
	}

}
