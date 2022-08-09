package p01.basic;

/*
 * Logical Operator(논리연산자)
 * 1. &&	and
 * 2. ||	or
 * 3. !		not
 * ...pdf자료참고 
 */

public class LogicalOperatorEx {

	public static void main(String[] args) {

		int a1 = 10;
		int a2 = 20;
		int a3 = 20;
		int a4 = 0;
		
		boolean bresult;
		
		bresult = (a1 < a2) && (a2 == a3);
		System.out.println("bResult = " + bresult);
		bresult = (a1 < a2) || (a2 == a3);
		System.out.println("bResult = " + bresult);
		
		bresult = (a1 > a2) && (a2 == a3);
		System.out.println("bResult = " + bresult);
		bresult = (a1 > a2) || (a2 == a3);
		System.out.println("bResult = " + bresult);
		
		bresult = !(a1 > a1);
		System.out.println("bresult = " + bresult);
	}

}
