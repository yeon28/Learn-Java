package p03.runtime_exception_multicatch;

/*
 Exception 처리 전체 문법
 - try 다음에 catch 여러개 사용 가능함.
   - try - multi catch - finally
   - finally는 없어도 괜찮음.
- finally는 try에서 Exception이 발생하지 않더라도 무조건 실행됨.   
 */
public class RuntimeExceptionMultiCatchEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			// ArrayIndexOutOfBoundsException 발생
			data1 = args[0];	// args[0] = null;
			data2 = args[1];	// args[1] = null;

			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;

			System.out.println(data1 + " + " + data2 + " = " + result);

			Class cls = Class.forName("java.lang.String2");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("실행 매개 변수의 수가 부족");
			System.out.println("[실행 방법]");
			System.out.println("eclipse Run - Run Configuration 메뉴에 들어가서 num1 num2 입력하세요");

		} 
		
		//  Run Configuration에서 10 10a를 넣었을 때
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가 ");

		} 
		
		//  Run Configuration에서 10 20를 넣었을 때, Class cls = Class.forName("java.lang.String2"); 이면
		catch (ClassNotFoundException e) {
			System.out.println("compile time 관련 exception 에러 처리");

		} 
	//  Run Configuration에서 10 20를 넣었을 때, Class cls = Class.forName("java.lang.String"); 이면
		finally {
			System.out.println("덧셈 연산 처리 프로그램 종료");
		}

	}
}
