package p02.compile_exception;

/*
Compile Exception 처리 방법

- 프로그램 소스 코드 안에 강제적으로 try-catch문 만들어서 사용해야함.
 */
public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
//		Class cls = Class.forName("java,lang.String");
//		--> error : Unhandled exception type ClassNotFoundException
		
		try {
			// cls : java,lang.String class의 필드, 컨스트럭터, 메소드 관련 정보를 갖고 있는 인스턴스
			// forName 메소드에서 parameter로 넘어온 클래스가 없으면 ClassNotFoundException 인스턴스 발생
			Class cls = Class.forName("java,lang.String");
			System.out.println("클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
}
