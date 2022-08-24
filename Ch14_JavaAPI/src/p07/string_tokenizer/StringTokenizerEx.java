package p07.string_tokenizer;

import java.util.StringTokenizer;

/*
 StringTokenizer(), nextToken()
 
 - StringTokenizer(읽어올 문자열, 나눌 문자열);
   - StringTokenizer(text, "/");
 - nextToken()은 메모리에서 해당 데이터를 제거 후 읽어옴.
   - Oracle 등 table에서 데이터를 읽어오거나, java collection등 framework에서도 사용함.
 */
public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");

		int countTokens = st.countTokens();	// token으로 나눠진 전체 갯수
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();	// nextToken()
			System.out.println(token);
		}
		
		System.out.println();
		
		// 현재 st는 비어있음.
		st = new StringTokenizer(text, "/"); 
		// 같은 st를 만드는 이유는
		// nextToken()이 힙메모리에 "홍길동/이수홍/박연수"문자열을 모두 버렸기 때문
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
	}
	
}
// 결과를 가져오고 하나씩 읽어냄과 동시에 제거해 메모리를 바로 비우는 형식
// --> 오라클(Oracle) 등 table에서 데이터를 읽어오거나, java collection 등 framework에서도 사용함.
