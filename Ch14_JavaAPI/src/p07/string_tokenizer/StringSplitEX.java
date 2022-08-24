package p07.string_tokenizer;

/*
 split() 문자열 분할
 - String class method
 - split("&|,|-"); -->  '&' or ',' or '-' 로 분할하라는 의미
 
 - 웹 크롤링할 때 사용함.
   ex)
   - 모든 웹사이트를 대상으로 특정 문자열로 검색할 때
   - 검색 결과가 특정 문자열이 포함된 string데이터로 넘어옴
   - 찾으려고 하는 키워드로 분할함(split)
 */
public class StringSplitEX {

	public static void main(String[] args) {

		String text = "홍길동&이수용,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
	}

}
