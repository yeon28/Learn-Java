package p04.dowhile_basic;

public class DoWhileBasic {

	public static void main(String[] args) {

		int count = 0;

		do {
			System.out.println("java");
			count++;
		} while (count < 10);


		//--------------------------------------------
		
		count = 0;

		do {
			System.out.println("java!!!!!!!!!!!!!!!");
		} while (count > 10);
		
		
		//------------------------------------------------
		
		// 조건이 안 맞으면 실행하지 않음
		while (count > 10) {
			System.out.println("java!!!!!!!!!!!!!!!");
			count++;
		}

	}

}
