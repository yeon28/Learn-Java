package p01.practice;

/*
 * 1.메소드 parameter를 사용해 배열을 여러개의 값을 parameter로 넘길 수 있어서
 *  max method처럼 여러개의 숫자에 대하여 최대값을 구하는 여러개의메소드를 선언할 필요 없음.
 *  2. 배열과 유사한 다른 표기법은 '...'을 사용한 표기법
 *    actual parameter로 배열을 사용해도 인식된다
 *    primitive 타입으로 여러개 가변적으로 인식됨.
 */
public class VariableArgsDemo {

	public static void main(String[] args) {
		
		int maxValue;
		
		int a = 1;
		int b = 2;
		int c = 3;

		int[] numbers = { 1, 2, 3, 4, 5, 12, 15 };

		maxValue = max(a, b);
		System.out.println("maxValue : " + maxValue);
		maxValue = max(a, b, c);
		System.out.println("maxValue : " + maxValue);
		maxValue = max(numbers);
		System.out.println("maxValue : " + maxValue);
		maxValue = max(15, 24, 49, 77, 99, 120, 45);
		System.out.println("maxValue : " + maxValue);

	}



	public static int max(int a, int b) {

		int result;

		if (a > b)
			return a;
		else
			return b;
	}

	public static int max(int a, int b, int c) {

		int result;

		result = max(max(a, b), c);
		return result;
	}
	
//	public static int max(int[] num) {
//		int result = 0;
//
//		for (int k : num)
//			if (result < k)
//				result = k;
//		return result;
//	}
	
	public static int max(int... num) {
		int result = 0;

		for (int i = 1; i < num.length; i++) {
			if (num[i] > result) {
				result = num[i];
			}
		}
		return result;
	}
}
