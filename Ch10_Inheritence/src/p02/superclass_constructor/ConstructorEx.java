package p02.superclass_constructor;

public class ConstructorEx {

	public static void main(String[] args) {
		/*
		 상속 생성자 호출 순서
		 1. JVM에서 heap 메모리에 부모 인스턴스 생성
		 2. JVM에서 heap 메모리에 자식 인스턴스 생성
		 3. 부모 클래스인 Parent 클래스의 default constructor 호출
		 4. 자식 클래스인 Child 클래스의 default constructor 호출 
		 */
		Child c = new Child();
		
		System.out.println("-------------------");
		
		/*
		 상속 생성자 호출 순서
		 1. JVM에서 heap 메모리에 부모 인스턴스 생성
		 2. JVM에서 heap 메모리에 자식 인스턴스 생성
		 3. 부모 클래스인 Parent 클래스의 default constructor 호출
		 4. 자식 클래스인 Child 클래스의 Child(int homePhoneNum) constructor 호출 
		 */
		Child c2 = new Child(11);
		
		
		
	}
}
