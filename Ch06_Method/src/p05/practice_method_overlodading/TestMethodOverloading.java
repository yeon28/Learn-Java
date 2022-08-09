package p05.practice_method_overlodading;
/*
 * tMethodOverloading
 * 
 * - 메소드의 이름이 동일하더라도 method signature가 다른경우 jvm이 다른 메소드로 인식
 * - c언어에서는 메소드 오버로딩이 허용 안 됨.
 * c언어늬 method signature의 메소드는 이름만 해당함.
 * 
 */
public class TestMethodOverloading {


	public static void main(String[] args) {

		System.out.println("3과 4의 최대값 : " + max(3, 4));
		System.out.println("3.2과 5.4의 최대값 : " + max(3.2, 5.4));
		System.out.println("3.2과 5.4와 10.4의 최대값 : " + max(3.2, 5.4, 10.4));

	}

	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static double max(double num1, double num2, double num3) {
		double result;

		result = max(max(num1, num2), num3);

		return result;
	}

}
