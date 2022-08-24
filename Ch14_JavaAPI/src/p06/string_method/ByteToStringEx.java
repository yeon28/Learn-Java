package p06.string_method;

public class ByteToStringEx {

	public static void main(String[] args) {
		byte[] bs = { 72, 101, 108, 111, 32, 74, 97, 118, 97 };
//		byte[] bs = { 'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a' };

		String str1 = new String(bs);
		System.out.println(str1);

		String str2 = new String(bs, 6, 4);
		System.out.println(str2);
	}

}
