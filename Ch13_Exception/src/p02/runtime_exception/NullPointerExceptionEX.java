package p02.runtime_exception;

/*
NullPointerException
- null객체에 '.'를 사용하여 메소드를 사용할 경우 발생하는 에러
 */
public class NullPointerExceptionEX {

	public static void main(String[] args) {
		
//		String data = null;
//		
//		// ptintln method에서 parameter로 넘어오는 String 인스턴스가 null이면 null출력
//		System.out.println(data);
//		System.out.println(data.toString());
//		//--> error : Cannot invoke "String.toString()" because "data" is null
//		//null객체에 '.'를 사용하여 메소드를 사용할 경우 발생하는 에러 
		
//		----------------------------------------------------------
		
		String data = null;
		try {
			System.out.println(data);
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer error 발생");
		}
		
		
	}
}
