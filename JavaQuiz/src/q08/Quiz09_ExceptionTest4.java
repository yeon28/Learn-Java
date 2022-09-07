package q08;

public class Quiz09_ExceptionTest4 {

	@SuppressWarnings("finally")
	public void exceptionMethod(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10 / num;
			System.out.println("result = " + result);
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 하나 입력해 주세요.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("인자를 정수 타입으로 입력해 주세요.");
			return;
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나누면 안 돼요.");
			return;
		} finally {
			System.out.println("실행");
			return;
		}
	}

	public static void main(String[] args) {
		Quiz09_ExceptionTest4 ext4 = new Quiz09_ExceptionTest4();
		ext4.exceptionMethod(args);
	}

}
