package p02.object_class_tostring;

import java.util.Date;

/*
 * println(obj)메소드 내부적으로 obj가 클래스의 인스턴스라면 , obj.toString() 실행
 * - Object 클래스의 toString() 메소드 실행결과
 *   - 패키지명 + 클래스명 + @ + 힙메모리주소(16진수)
 * - String, Date class는 Object class의 toString()메소드를 override하여 커스터마이징
 */
public class ToString {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		String name = "홍길동";
		Date date = new Date();
		
		System.out.println(System.identityHashCode(obj)); // 힙메모리 10진수 주소 출력
		System.out.println(System.identityHashCode(obj.toString()));
		
		System.out.println(obj.toString()); // toString()메소드 16진수로 출력
		System.out.println(obj);			// obj.toString() method 실행
		
		System.out.println(name.toString()); 
		System.out.println(name);
		
		System.out.println(date.toString());
		System.out.println(date);
		
	}
	
}
