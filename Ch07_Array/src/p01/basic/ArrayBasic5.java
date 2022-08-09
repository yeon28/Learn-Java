package p01.basic;

//참고 :  c 언어는 string이라는 데이터 타입 없음
public class ArrayBasic5 {

	public static void main(String[] args) {
		
		String city1 = "Dallas"; // string과 char[]은 데이터 타입이 틀림.
		
		char[] city = {'D','a','l', 'l','a','s'};
		
		for (char element : city) {
			System.out.println(element);
		}
		
		
		System.out.println(city);
		System.out.println(city1);
	}

}
