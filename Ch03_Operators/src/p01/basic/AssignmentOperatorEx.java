package p01.basic;

/*
 * Assignment Operator (할당 연산자)
 * 1. =
 * 2. += -= *= /= %= ... --> C언어 부터 사용된 표현방식
 * 3.
 *  
 */

public class AssignmentOperatorEx {

	public static void main(String[] args) {

		int n1 = 10;
		
		System.out.println("n1 = " + n1);
		
//		n1 = n1 + 10;
		n1 += 10; //c언어 스타일
		System.out.println("n1 = " + n1);
		
//		n1 = n1 - 10;
		n1 -= 10;
		System.out.println("n1 = " + n1);
		
//		n1 = n1 * 2;
		n1 *= 2;
		System.out.println("n1 = " + n1);
		
//		n1 = n1 / 3;
		n1 /= 3;
		System.out.println("n1 = " + n1);
		
		
	}

}
