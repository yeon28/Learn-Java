package p01.basic;

/*
 * Relational Operator(비교연산자)
 * 1. == (예 , a == b : a와 b의 값이 같으면 true, 틀리면 false.)
 * 2. != (예 , a != b : a와 b의 값이 같으면 false, 틀리면 true.)
 * 3. > (예 , a > b : a가 b보다 값이 크면true , 작으면 false)
 * 4. >= (예 , a >= b : a가 b보다 값이 크 같으면 true , 작으면 false)
 * 5. < (예 , a < b : a가 b보다 값이 크면false , 작으면 true)
 * 6. <= (예 , a <= b : a가 b보다 값이 크거나 같으면false , 작으면 true)
 */

public class RelationalOperatorEx {

	public static void main(String[] args) {

		int a1 = 5;
		int a2 = 10;
		int a3 = 5;
		
		boolean bresult;
		
		System.out.println("a1 == a2" + (a1 == a2));
		System.out.println("a1 == a3" + (a1 == a3));

		bresult = (a1 == a2);
		System.out.println("bresult = " + bresult);	
		bresult = (a1 == a3);
		System.out.println("bresult = " + bresult);
		
		
		System.out.println("a1 != a2 : " + (a1 != a2));
		System.out.println("a1 != a3 : " + (a1 != a3));

		
		System.out.println("a1 > a2 : " + (a1 > a2));
		System.out.println("a1 < a3 : " + (a1 < a3));
		
		
		System.out.println("a1 >= a2 : " + (a1 >= a2));
		System.out.println("a1 <= a3 : " + (a1 <= a3));
		
		
	}

}
