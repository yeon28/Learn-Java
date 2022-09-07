package q08;

public class Quiz09_ExceptionTest5 {
	public void exceptionMethod() {
		//RuntimeException을 발생시키고 있기 때문에 예외 처리를 해주지 않아도 컴파일 시에는
		//오류가 발생하지 않는다 그러나 해당 프로그램을 실행하면 예외가 발생한다
		throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		Quiz09_ExceptionTest5 ext5 = new Quiz09_ExceptionTest5();
		ext5.exceptionMethod();
	}

}
