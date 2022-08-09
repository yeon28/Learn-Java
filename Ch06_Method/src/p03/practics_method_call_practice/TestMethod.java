package p03.practics_method_call_practice;

/*
 * - jvm이 method실행(activation record에 메모리 스택영역에 할당하는 방식)
 * - 메소드 호출순서 
 * jvm이 main()메소드 호출
 * max메소드 호출
 *  - 메인 메소드에서 맥스 메소드를 호출 할 때, actual parameter로 선언된 변수의 값이
 * max메소드의 formal parameter로 선언된 변수로 복사 --> call by value라고 함
 * - call by value의 영역
 * : 메소드 formal parameter를 호출할 때, formal의 변수로 값이 전달
 * !!참고: call by referencs의 정의: 메소드의 formal을 호출할 때 formal의 변수로 주소가 전달
 * 
 */
public class TestMethod {

	public static void main(String[] args) {
		int i = 5;
		int j = 12;
		int k = max(i, j);
		
		System.out.println(i +"와 "+j +"중 최대값 : "+k);
	}
	
	//2개 숫자 중에 최대값 구하기.
	public static int max(int num1,int num2) {
		int result;
		
		if (num1>num2) {
			result = num1;
		}else {
			result = num2;
		}
		return result;
	}
	

}
