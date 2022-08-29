package p04.generic_extends;

/*
 <T extends Number> : 
 1. T는 부모인 Number나 자식들인 byte double float integer long short class만 가능하다는 의미
 2. primitive 타입의 wrapper 클래스만 사용 가능함.
 
 Double.compare(a, b)메소드의 리턴 값
 - a < b, -1 return
 - a == b, 0 return
 - a > b, 1 return
 */
public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		
		return Double.compare(d1, d2);
	}
}
