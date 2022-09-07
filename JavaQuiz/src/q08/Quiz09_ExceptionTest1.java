package q08;

public class Quiz09_ExceptionTest1 {

	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result = " +  result);
		} catch (Exception e) {
			System.out.println("정수를 0으로 나누기 불가능 ");
			System.out.println("프로그램 계속 실행 ");
		}
	}

}
