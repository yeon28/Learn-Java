package p05.throw_exception;

/*
Throw Exception 처리방법
- 원칙은 exception이 발생한 메소드에서 try-catch를 사용하여 예외 처리하는 것이 원칙임.
- exception이 발생한 메소드를 호출하는 상위 메소드에서 처리하도록 하는 방법이 존재함.
  - 하위 메소드에서 throws ClassNotFoundException 같은 exception 선언할 수 있음
  - 상위 메소드에서 모든 종류의 exception을 한번에 처리 할 경우 사용함.
 */
public class ThrowExceptionEx {

	public static void main(String[] args) {
		
		try {
			findClass();
			System.out.println("정상 처리됨.");
		} catch (ClassNotFoundException e) {
			System.out.println("compile-time Exception 발생");
		}
		
	}
	
	// method선언문에서 throws ClassNotFoundException의미는 
	// --> 메소드 내부에서 ClassNotFoundException이 발생되며느 메소드를 호출한 메소드로 Exception을 넘김
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
	
}
