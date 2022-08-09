package p01.basic;

public class StringBasic8 {

	public static void main(String[] args) {

		String message = "wellcome to java!";
		
		System.out.println(message.substring(0,5));
		System.out.println(message.substring(0,7));
		System.out.println(message.substring(0,11));
		
		System.out.println(message.substring(2,5));
		System.out.println(message.substring(2,7));
		System.out.println(message.substring(2,11));
		
		System.out.println(message.substring(0));
		System.out.println(message.substring(2));
		
	}

}
