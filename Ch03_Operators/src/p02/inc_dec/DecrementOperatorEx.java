package p02.inc_dec;

// decrement operator : --

public class DecrementOperatorEx {

	public static void main(String[] args) {

		int n1 = 10;
		int result;
		
		System.out.println("n1= " + n1);
		n1--; // n1 -= 1, (n1 = n1 - 1)와 같은 의미
		System.out.println("n1= " + n1);
			
		
		--n1; // n1 -= 1
		System.out.println("n1= " + n1);
		
		result = n1--; // result = n1;처리 후,  n1 -= 1;실행
		System.out.println("result= " + result);
		System.out.println("n1= " + n1);
		
		result = --n1; // n1 -= 1;처리 후, result = n1;실행
		System.out.println("result= " + result);
		System.out.println("n1= " + n1);
		
		
	}

}
