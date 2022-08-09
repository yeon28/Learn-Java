package p01.string;

public class StringReplaceAll {

	public static void main(String[] args) {

		String text = "<p>I don't want this p tag<\\p>";
		System.out.println(text);

		// html 태그 없애기, 웹개발 응용 가능.
		text = text.replaceAll("\\<.*?\\>", "");
		System.out.println(text);

	}

}
