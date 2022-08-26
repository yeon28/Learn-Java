package Quiz04_08;

import java.util.StringTokenizer;

public class SplitEx {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1 (split() 메소드 이용)
		String[] string = str.split(",");
		
		for (String obj : string) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		//방법2 (StringTokenizer 메소드 이용)
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
	
}
