package p04.catch_order;

/*
 Exception multi catch 처리방법
 - catch 순서가 매우 중요함.
   - catch에서 최상위 class인 Exception이 맨 처음에 나오면 catch문에 Exception blockdl처리 안됨
   - 자동형변환이 발생하기 때문
 - 최상위 부모 클래스인 exception은 multi-catch block의 맨 마지막에 넣음
 
 */
public class CatchOrderEX {

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

//				Class cls = Class.forName("java.lang.String2");
				Class cls = Class.forName("java.lang.String");
			
				
//			// Exception class는 모든 runtimeException, compile관련 모두의 부모임.
//			// --> promotion 발생
//			}catch (Exception e) {// 모든 Exception 수행되는 문제 발생}	

				
			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("실행 매개 변수의 수가 부족");
				System.out.println("[실행 방법]");
				System.out.println("eclipse Run - Run Configuration 메뉴에 들어가서 num1 num2 입력하세요");

			} 
			catch (NumberFormatException e) {
				// Run Configuration에서 10 10a를 넣었을 때
				System.out.println("숫자로 변환 불가 ");
				
			} 
			catch (ClassNotFoundException e) {
				// Run Configuration에서 10 20를 넣었을 때, 
				// Class cls = Class.forName("java.lang.String2"); 이면
				System.out.println("compile time 관련 exception 에러 처리");

			} catch (Exception e) { // Exception의 최호의 보루
				System.out.println("위에 언급한 Exception 이외에 다른 Exception 발생");
			}
			finally {
				// Run Configuration에서 10 20를 넣었을 때, 
				// Class cls = Class.forName("java.lang.String"); 이면
				System.out.println("덧셈 연산 처리 프로그램 종료");
			}
		
	}

}
