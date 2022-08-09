package p01.basic;

/*
 * + - / % * : 산술연산자 (arithmetic operator)
 * 
 */

public class ArithmeticOperatorEx {

	public static void main(String[] args) {

		int a1 = 10;
		int a2 = 3;
		int result;
		
		double dresult;
		
		result = a1 + a2 ;
		System.out.println("result = " + result);
		
		result = a1 - a2 ;
		System.out.println("result = " + result);
		
		result = a1 * a2 ;
		System.out.println("result = " + result);
		
//		나누기는 언어마다 차이 있음
		result = a1 / a2 ; // / : 나눈 몫
		System.out.println("result = " + result);
		
		result = a1 % a2 ; // % : 나머지 값
		System.out.println("result = " + result);
		
		

		dresult = a1 / a2;
		System.out.println("dresult = " + dresult);
		
		dresult = a1 / (double)a2;	//a2를 double로 자동 형변환시킴.
//		dresult = (double)a1 / a2; 	// double로 자동 형변환시킴.
		System.out.println("dresult = " + dresult);
		
		
			
	}

}
