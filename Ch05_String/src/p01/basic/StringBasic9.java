package p01.basic;

public class StringBasic9 {
	public static void main(String[] args) {

		System.out.println("wellcome to java".indexOf('w'));
		System.out.println("wellcome to java".indexOf('o'));
		System.out.println("wellcome to java".indexOf('o',5));
		System.out.println("wellcome to java".indexOf('o',5));
		System.out.println("wellcome to java".indexOf("come"));
		System.out.println("wellcome to java".indexOf("comet"));
		System.out.println("wellcome to java".indexOf("java",5));
		System.out.println("wellcome to java".indexOf("Java",5));
		
		System.out.println("wellcome to java".toUpperCase().indexOf("JAVA",5));
		
		System.out.println();
		
		System.out.println("wellcome to java".lastIndexOf('w'));
		System.out.println("wellcome to java".lastIndexOf('o'));
		System.out.println("wellcome to java".lastIndexOf('o',5));
		System.out.println("wellcome to java".lastIndexOf('o',5));
		System.out.println("wellcome to java".lastIndexOf("come"));
		System.out.println("wellcome to java".lastIndexOf("comet"));
		System.out.println("wellcome to java".lastIndexOf("java",5));
		System.out.println("wellcome to java".lastIndexOf("Java",5));
		
		System.out.println("wellcome to java".toUpperCase().lastIndexOf("JAVA",5));
		
	}
}
