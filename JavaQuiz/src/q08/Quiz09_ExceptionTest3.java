package q08;

public class Quiz09_ExceptionTest3 {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result = " + result);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 하나만 입력하세요. ");
		}
		catch (NumberFormatException e) {
			System.out.println("인자를 정수로 입력하세요.");
		}
		catch(ArithmeticException e) {
			System.out.println("정수를 0으로 나눌 수 없습니다. ");
		}
		System.out.println("프로그램 계속 실행 ");
	}

}
