package p01.basic;

/*
 * Ternary Operator(3항 연산자)
 *  	: 피연산자 갯수가 3개
 *  
 *  A ? B : C 
 *  	연산자는 ?, : 2개이고 
 *  	피연산자는 A B C 3개 있는 경우
 *  	--> A가 true 이면 B를 실행, A가 false면 C 실행
 */

public class TernaryOperatorEx {

	public static void main(String[] args) {

		int n1 = 15;
		int n2 = 10;

		int max;
		
		
		max = ( n1 > n2 ) ? n1 : n2;
		System.out.println("max = " + max);
		
		
		if ( n1 > n2 ) {
			max = n1;
		} else {
			max =n2;
		}
		System.out.println("max = " + max);
		
		
		//
		int result; 
		
		result = (n1 > n2)? (n1 + n2) : (n1 - n2);
		System.out.println("result = " + result);
		
	}

}
