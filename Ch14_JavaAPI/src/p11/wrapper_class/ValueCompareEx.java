package p11.wrapper_class;

// primitive 값이 동일해도 Wrapper class로 변환한 후에는 힙메모리에 인스턴스로 별도 생성죔.
/*
 Wrapper class의 인스턴스 값을 비교하는 방법들은 
 - primitive 타입으로 변환 후 비교 하는 방법
 - Wrapper class의 equals 메소드 사용하는 방법
 */
public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;	// auto boxing할 때, 자동으로 힙메모리에 인스턴스 새로 생성됨.
		Integer obj2 = 300;

		System.out.println("obj1 == obj2 : " + (obj1 == obj2));
		System.out.println("nuboxing 후 (obj1 == obj2) : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("obj.equals(obj2) : " + (obj1.equals(obj2)));
	} 

}
