package p01.basic;

public class StringBasic {

	public static void main(String[] args) {

		String message = "안녕하세요. ";
		String message1 = "집에 가고 싶어요. ";
		String message2;

		System.out.println(message);
		System.out.println(message1);

		message2 = message + "!!!!!!!!!!" + message1;
		System.out.println(message2);
		
		// 2+3+message; --> "5" + "안녕하세요. "
		message2 = 2+3+message;
		System.out.println(message2);
		
		// 2+3+message; -->  "안녕하세요. " + "2" + "3"
		message2 = message+2+3;
		System.out.println(message2);
		
	}

}
