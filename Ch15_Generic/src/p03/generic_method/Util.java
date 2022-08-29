package p03.generic_method;

/*
<T> Box<T> boxing(T t) 
- <T> : method 안에서 T를 data type으로 사용하겠다는 의미임.
- Box<T> : method의 return type
- boxing(T t) 
 */
public class Util {

	public static <T> Box<T> boxing(T t) {
		Box<T> box =new Box<T>();
		box.setT(t);
		
		return box;
	}
}
