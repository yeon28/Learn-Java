package p01.object_class_equals;

/*
 Object class의 equals method 결과 도출 과정
 - equals method는 == 연산자와 같은 결과를 도출함.
 - object1 == object2 결과는 false
 - object1.equals(object2) 결과도 false
 String class의 equals method존재
 - Object 클래스에 equals method를 override시켜 새로 코딩함.
 - 문자열 내용이 같으면 true
 */
public class ObjectEqualsEx {

	public static void main(String[] args) {
		
		Object object1 = new Object();
		Object object2 = new Object();
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		String name3 = "홍길동";
		String name4 = "홍길동";	// String literal
		
		int x = 10;
		int y = 10;
		
//		------------------------------------object
		
		// object1, object2의 힙메모리의 시작 주소 값 구하기.
		System.out.println(System.identityHashCode(object1));	//305808283
		System.out.println(System.identityHashCode(object2));	//2111991224
		
		boolean result = object1.equals(object2);	//false
		System.out.println("result : " + result);	
		
		result = (object1 == object2);	// 힙메모리의 주소 값을 비교함.
		System.out.println("result : " + result);
		
		result = (x == y);				// 값을 비교함.
		System.out.println("result : " + result);
		
//		-----------------------------------name
		
		result = name1.equals(name2);	//true
		System.out.println("result : " + result);	
		
		result = (name1 == name2);	// override 힙메모리의 주소 값을 비교함.
		System.out.println("result : " + result);
		
//		-----------------------------------
		
		result = name3.equals(name4);	//true
		System.out.println("result : " + result);	
		
		result = (name3 == name4);	// true
		System.out.println("result : " + result);
		// String literal인 경우 java가 힙메모리에 1개만 만들어 놓음.
	}
	
	
}
