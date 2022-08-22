package p02.runtime_exception;

/*
ArrayIndexOutOfBoundsException
- array에서 접근할 수 없는 index로 array를 사용하면 발생함.
- RuntimeException은 개발자 본인 능력에 의해서 판단하여 try-catch문을 만들어야 함.
 */
public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		
		try {
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열에서 접근할 수 없는 index입니다.");
			
		}
//		
//		System.out.println("---------------------------------");
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
		//--> error : Index 3 out of bounds for length 3
		//인덱스 길이 보다 더 긴 값을 줘서 발생한 에러
	}
}
