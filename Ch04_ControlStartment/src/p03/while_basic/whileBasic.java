package p03.while_basic;

public class whileBasic {

	public static void main(String[] args) {

		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		System.out.println("java 존경합니다");
		// 같은 내용 반복이나 비슷한 내용 반복

		//-----------------------------------------------
		int count = 0;	// 반복문의 초기화
		while (count < 10) {
			System.out.println("java");
			count++;
		}
		//--------------------------------------------------
		
		System.out.println(" ");

		count = 10;
		while (count >= 10) {
			System.out.println("java");
			count--;
		}
		
		//--------------------------------------------------

		System.out.println(" ");

		count = 1;
		while (count <= 10) {
			System.out.println("java");
			count++;
		}
		
		//--------------------------------------------------

		System.out.println(" ");
		
		count = 1;
		int endValue =10;
		while (count <=endValue) {
			System.out.println("java 존경합니다");
			count++;
		}
	}

}
