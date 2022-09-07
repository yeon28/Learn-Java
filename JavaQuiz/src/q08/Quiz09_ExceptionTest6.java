package q08;

public class Quiz09_ExceptionTest6 {
	public void exceptionMethod() throws Exception{
		throw new Exception("throw Exception 발생");
	}
	public static void main(String[] args) {
		Quiz09_ExceptionTest6 ext6 = new Quiz09_ExceptionTest6();
		try { 
			ext6.exceptionMethod();
		}
		catch(Exception e) {
			System.out.println("호출한 메소드에서 예외 처리");
			System.out.println(e);
		}

	}

}
