package p01.basic;

/*
 * Unary Operator(단항연산자)
 * 		+ - : 피연산자 앞에 붙여 사용할 경우
 * Binary Operator(이항 연산자)
 *  	operator가 2개인 경우 (산술연산자 : + - * /)
 * 
 */

public class UnaryOperatorEx {

	public static void main(String[] args) {

		int n1 = 20;
		int result;
		
		result = +n1 ;
		System.out.println("result = " + result);
		
		result = -n1 ;
		System.out.println("result = " + result);
		
	}

}
