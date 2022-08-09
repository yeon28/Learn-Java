package p01.basic;

public class StringBasic3 {

	public static void main(String[] args) {
		
		String message = "wellcome to java";
		 int length = message.length();
		 
		 char firstChar = message.charAt(0);
		 char thirdChar = message.charAt(2);
		 char lastChar = message.charAt(length-1);
		 
		 System.out.println(message + "의 첫번쩨 글자는 "+firstChar);
		 System.out.println(message + "의 첫번쩨 글자는 "+thirdChar);
		 System.out.println(message + "의 첫번쩨 글자는 "+lastChar);
		 
		 for (int i = 0; i < message.length(); i++) {
			 System.out.println(message + "의" +(i+1)+" 첫번쩨 글자는 "+message.charAt(i));
		}
		 
		
	}

}
