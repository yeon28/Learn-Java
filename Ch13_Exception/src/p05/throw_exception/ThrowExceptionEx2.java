package p05.throw_exception;

/*
main method에서 Throw Exception을 사용한 경우
- jvm이 메인에서 넘긴Exception을 실행함
  - user friendly 하지 않아서 추천하지 않음.
- 절대 메인 메소드에서 throws 사용하지 말 것. 
 */
public class ThrowExceptionEx2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
			findClass();
			System.out.println("정상 처리됨.");
		
	}
	
	// method선언문에서 throws ClassNotFoundException의미는 
	// --> 메소드 내부에서 ClassNotFoundException이 발생되며느 메소드를 호출한 메소드로 Exception을 넘김
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
	
}
