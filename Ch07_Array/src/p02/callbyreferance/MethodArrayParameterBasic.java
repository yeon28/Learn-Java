package p02.callbyreferance;

/*testArrayParameter 메소드 Parameter
 * 
 * - number 
 *   call by value에 의해 x값이 1이 number로 copy
 * - numbers
 *   y의 값(주소)이 numbers로 copy --> 주소가 복사 됨.
 *   (주소를 copy해서 call by reference라고 함)
 *   --> call by reference에 의해 호출된 메소드 안에서 배열 원소값을 수정하면 메인 메소드에서 해당 배열 원소 값이 수정 됨.
 */
public class MethodArrayParameterBasic {

	public static void main(String[] args) {

		int x = 1;
		int[] y = new int[10];

		for (int i = 0; i < y.length; i++) {
			y[i] = 100;
		}

		testArrayParameter(x, y);

		System.out.println("x = " + x);
		System.out.println("y[0] = " + y[0]);

		System.out.println("---------------------------------");

		for (int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "] : " + y[i]);
		}

	}

	public static void testArrayParameter(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 3333;
	}

}
