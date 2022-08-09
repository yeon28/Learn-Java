package p01.basic;

/*
 * Operator Precedence (연산자 우선순위)
 *  assignment operator인 =을 기준으로 , 
 * 1. 오른쪽에 있는 수식은 왼쪽부터 오른쪽으로 계산
 * 2. 왼쪽부터 오른쪽으로 계산할 때 연산 순위가 높은 연산자가 먼저 연산 * / %가 + -보다 먼저)
 * 3. ()가 모든 연산자 보다 우선순위가 높음(먼저 계산)
 * 
 * 팁 - 연산순위가 제일 높은 () 적극 활용하기!!
 */

public class OperatorPrecedenceEX {

	public static void main(String[] args) {

		int result;
		
		result = 5 - 2 + 3 - 6; // 방법1
		System.out.println("result = " + result);
		
		result = 3 - 4/2 + 8 * 4 - (5+2)%3; // 방법2
		System.out.println("result = " + result);
		
	}

}
