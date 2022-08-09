package p01.If_basic;


public class IfBasic2 {

	public static void main(String[] args) {

		int i = 10;

		if (i > 0) 
			System.out.println("i는 양수입니다.");
		/*
		 * if문 다음에 오는 명령어가 1개만 있느면 {} 를 사용하지 않아도 됨.
		--> 추천하지 않음
		나중에 line이 늘어나면 알아보기 힘들어짐
		 */
		

		if (i > 0) {
			System.out.println("i는 역시 양수입니다.");
		}

		if (i % 2 == 0) {
			System.out.println("i는 2배수(짝수) 입니다.");
		}
		
		if (i % 3 == 1) {
			System.out.println("i는 홀수 입니다.");
		}
		
		if (i % 5 == 0) {
			System.out.println("i는 5배수 입니다.");
		}

		if ((i % 2 == 0) || (i % 5 == 0)) {
			System.out.println("i는 2의 배수이거나 5의 배수입니다.");
		}

		if ((i % 2 == 0) && (i % 5 == 0)) {
			System.out.println("i는 2의 배수이고 5의 배수입니다.");
		}
	}

}
